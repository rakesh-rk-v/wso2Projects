import React, { useState, useEffect, useCallback } from 'react';
import * as routes from '../../constants/routes';
import RoamingImage from '../../images/defaultBanner.jpg';
import {
  Stepper, Step, StepLabel,
  TextField, Grid, Container, AppBar,
  Toolbar,
  Typography,
  Button,
  FormControl,
  List,
  ListItem,
  ListItemText,
  Card,
  CardContent,
  CardActions,
  Box,
  Switch,
  MenuItem,
  Paper,
  FormControlLabel,
  Select
} from '@mui/material';
import FlightIcon from '@mui/icons-material/Flight';
import HotelIcon from '@mui/icons-material/Hotel';
import LiveTvIcon from '@mui/icons-material/LiveTv';
import SavingsIcon from '@mui/icons-material/Savings'

import { Link } from 'react-router-dom'; // Import Link from react-router-dom
import { useSelector } from 'react-redux';
import PlanSummaryView from './PlanSummaryView';
import SignUp from '../../views/auth/signup';
import { useHistory, useLocation } from 'react-router-dom';
import { AirlineSeatReclineNormalOutlined, IntegrationInstructionsSharp, Wifi1BarOutlined } from '@mui/icons-material';
import AddressStepComponent from './AddressStepComponent2';
import PaymentPage from './PaymentPage';
import SimTypeAndNumberChooseComponent from './SimTypeAndNumberChooseComponent';

const steps = ['Select Plan', 'Register', 'Address', 'Review', 'Payment'];
// const case0InitialState = {
//   simType: '',
//   mobileNumber: '',
//   roaming: '',
//   pinCode: ''
// }

const OrderProcessStepsComponent = ({ selectedPlan }) => {
  const [isAddressValid, setIsAddressValid] = useState(false);
  const history = useHistory();
  const location = useLocation();
  const [activeStep, setActiveStep] = useState(0);
  const [step1Data, setStep1Data] = useState({});

  const [formData, setFormData] = useState({

    simTypeAndNumberData: step1Data,
    addressData: {},
    deliveryOption: 'regular',
    pickUpStore: '',
    selectedPlan: selectedPlan || {},

  });

  const profileMobileNumber = useSelector(
    (state) => state.profile?.mobile?.data?.primaryContact ?? null
  );
  const handleNext = () => {
    if (activeStep === 2 && !isAddressValid) {
      return alert('pleae fill required address filelds')
    }
    setActiveStep((prev) => prev + 1);
  }
  const handleBack = () => setActiveStep((prev) => prev - 1);
  const handleChange = (e) => {

    setFormData({ ...formData, [e.target.name]: e.target.value });
  }

  useEffect(() => {
    // Check if selectedPlan exists in location state
    if (location.state?.selectedPlan) {
      // Update formData with the selectedPlan from location.state
      setFormData(prevFormData => ({
        ...prevFormData,
        selectedPlan: location.state.selectedPlan
      }));
      // Optionally use a more user-friendly notification
      //console.log('Selected Plan:', location.state.selectedPlan);
    } else {
      // Redirect to HOME route if selectedPlan is not present
      history.push(routes.HOME); // Adjust route as per your application flow
    }

    // Update formData with simTypeAndNumberData from step1Data
    setFormData(prevFormData => ({
      ...prevFormData,
      simTypeAndNumberData: step1Data
    }));

  }, [location.state, step1Data, history, routes.HOME]);


  const onClickSignIn = () => {
    history.push('/signin'); // Replace with your sign-in route 
  };

  const handleDataFromCase0 = (data) => {
    //console.log(`in Orderprocee steps ${JSON.stringify(data)}`);

    setStep1Data(data);

    //console.log(JSON.stringify(step1Data))
  };
  const handleAddressValidation = (isValid) => {
    setIsAddressValid(isValid);
  };
  const handleAddressChange = (addressData) => {
    //console.log(JSON.stringify(addressData));
    setFormData((prevState) => ({
      ...prevState,
      addressData: addressData
    }));
    //console.log(JSON.stringify(formData))
  };


  const renderStepContent = (step) => {
    switch (step) {
      case 0:
        return (
          <SimTypeAndNumberChooseComponent onData={handleDataFromCase0} selectedPlan={formData.selectedPlan} />
        );

      case 1:
        return (
          <div>
            <SignUp onClickSignIn={onClickSignIn} />
          </div>
        );
      case 2:
        return (
          <div>
            <AddressStepComponent onValidation={handleAddressValidation} onAddressChange={handleAddressChange} />
          </div>
        );
      case 3:
        return (
          <div>
            <Container maxWidth="md" sx={{ mt: 4 }}>
              <Paper elevation={3} sx={{ p: 3 }}>
                <Typography variant="h6" gutterBottom>
                  Order summary
                </Typography>
                <Grid container spacing={2}>
                  <Grid item xs={12} md={6}>
                    <List>
                      <ListItem>
                        <ListItemText primary={formData.selectedPlan.planName} secondary={`$${formData.selectedPlan.price}/mo`} />
                        {/* {alert(JSON.stringify(formData.selectedPlan))} */}
                      </ListItem>
                      <ListItem>
                        <ListItemText primary={formData.simTypeAndNumberData.simType} />
                      </ListItem>
                      <ListItem>
                        {/* {console.log(`form Data ${JSON.stringify(formData.selectedPlan)}`)} */}
                        <ListItemText primary="Data" secondary={formData.selectedPlan.features[0]} />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Voice" secondary={formData.selectedPlan.features[1]} />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Text" secondary={formData.selectedPlan.features[2]} />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Transfer number" secondary={formData.simTypeAndNumberData.mobileNumber} />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Add-ons" secondary={`Roaming ${formData.simTypeAndNumberData.roaming}`} />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Promo code applied" secondary="- $5/mo (05-SPICADISCOUNT)" />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Estimated taxes" secondary="$5" />
                      </ListItem>
                      <ListItem>
                        <ListItemText primary="Recurring charge total" secondary="$10/mo (Charged every 30 days)" />
                      </ListItem>
                    </List>
                  </Grid>
                  <Grid item xs={12} md={6}>
                    <Box mb={2}>
                      <Typography variant="subtitle1"><strong>Billing address</strong></Typography>

                      <Typography variant="body2">
                        {console.log(formData)}
                        [{formData.addressData.billingAddress.addressLine1}]
                        <br />
                        [{formData.addressData.billingAddress.addressLine2}]
                        <br />
                        [{formData.addressData.billingAddress.city}]
                        <br />
                        [{formData.addressData.billingAddress.province}]
                        <br />
                        [{formData.addressData.billingAddress.postalCode}]
                        <br />
                        [{profileMobileNumber}]
                      </Typography>
                    </Box>
                    <Box mb={2}>
                      <Typography variant="subtitle1"><strong>Delivery address</strong></Typography>
                      <Typography variant="body2">
                        {console.log(formData)}
                        [{formData.addressData.deliveryAddress.addressLine1}]
                        <br />
                        [{formData.addressData.deliveryAddress.addressLine2}]
                        <br />
                        [{formData.addressData.deliveryAddress.city}]
                        <br />
                        [{formData.addressData.deliveryAddress.province}]
                        <br />
                        [{formData.addressData.deliveryAddress.postalCode}]
                        <br />
                        [{profileMobileNumber}]
                      </Typography>
                    </Box>
                    <Button variant="text" color="primary" onClick={() => setActiveStep(2)}>
                      Change address
                    </Button>
                  </Grid>
                </Grid>
                <Box mt={2} p={2} bgcolor="grey.200">
                  <Typography variant="subtitle1">Due today:</Typography>
                  <List>
                    <ListItem>
                      <ListItemText primary="Delivery fee" secondary="$1" />
                    </ListItem>
                    <ListItem>
                      <ListItemText primary="One-time activation fee" secondary="$10" />
                    </ListItem>
                    <ListItem>
                      <ListItemText primary="First month charge" secondary="$10" />
                    </ListItem>
                    <ListItem>
                      <ListItemText primary="Total" secondary="$21" />
                    </ListItem>
                  </List>
                </Box>

              </Paper>
            </Container>
          </div>
        );
      case 4:
        return (
          <>
            <PaymentPage />
          </>
        )
      // return (
      //   <div>
      //     <Typography variant="h6">Payment</Typography>
      //     <TextField label="Card Number" name="cardNumber" value={formData.cardNumber} onChange={handleChange} fullWidth margin="normal" />
      //     <TextField label="Expiry Date" name="expiryDate" value={formData.expiryDate} onChange={handleChange} fullWidth margin="normal" />
      //     <TextField label="CVV" name="cvv" value={formData.cvv} onChange={handleChange} fullWidth margin="normal" />
      //   </div>
      // );
      //   default:
      //     return <Typography>Unknown step</Typography>;
    }
  };

  return (
    <Container>
      <Grid container spacing={3}>
        {/* Steps View in Card Format */}
        <Grid item xs={12}>
          <div style={{ padding: '20px', backgroundColor: '#f0f0f0', borderRadius: '10px' }}>
            <Stepper activeStep={activeStep} alternativeLabel>
              {/* {console.log(`active step ${activeStep}`)} */}
              {steps.map((label) => (
                <Step key={label}>
                  <StepLabel>{label}</StepLabel>
                </Step>
              ))}
            </Stepper>
          </div>
        </Grid>

        {/* Content and Summary Section */}
        <Grid container spacing={3}>
          {/* Content Section (70%) */}
          <Grid item xs={12} md={8}>
            {renderStepContent(activeStep)}
            <div>
              <Button disabled={activeStep === 0} onClick={handleBack}>
                Back
              </Button>
              {/* <Button variant="contained" color="primary" onClick={handleNext}>
                {activeStep === steps.length - 1 ? 'Finish' : 'Next'}
              </Button> */}


              {activeStep === steps.length - 1 ?
                null : <Button variant="contained" color="primary" onClick={handleNext}>Next </Button>}

            </div>
          </Grid>

          {/* Plan Summary Section (30%) */}
          <Grid item xs={12} md={4}>
            <PlanSummaryView formData={formData} />
          </Grid>
        </Grid>
      </Grid>
    </Container>
  );
};

export default OrderProcessStepsComponent;
