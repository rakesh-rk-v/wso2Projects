import React, { useState } from 'react';

import { Button, Grid, Typography, Box } from '@mui/material';
import { useHistory } from 'react-router-dom';
import BestPlanCardView from '@/components/bestplans/BestPlanCardView'; // Adjust path as needed
import * as routes from '../../constants/routes';

const PlansViewComponent = () => {
  const [showAll, setShowAll] = useState(false);
  const [showNormal, setShowNormal] = useState(true); // State for normal plans
  const [showElite, setShowElite] = useState(false); // State for elite plans
  const [selectedPlan, setSelectedPlan] = useState(null);
  const history = useHistory();

  const handleSelectPlan = (planData) => {

    setSelectedPlan(planData);


    // Navigate to the multi-step form route

    history.push({
      pathname: routes.ORDER_PROCESS, // Adjust based on your route configuration
      state: { selectedPlan: planData } // Pass selectedPlan as state
    });
  };

  const normalPlans = [
    {
      planName: 'SpicaStarter',
      price: 15,
      features: ['1 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'START USING NOW',
      popularPlan: false, // Example: No popular plan flag for this plan
    },
    {
      planName: 'SpicaValue',
      price: 25,
      features: ['8 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'DATA for all day use',
      popularPlan: true, // Example: Popular plan flag for this plan
    },
    {
      planName: 'SpicaValue-3',
      price: 45,
      features: ['8 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'DATA for all day use',
      popularPlan: false, // Example: No popular plan flag for this plan
    },
    {
      planName: 'SpicaValue-4',
      price: 60,
      features: ['8 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'DATA for all day use',
      popularPlan: true, // Example: Popular plan flag for this plan
    },
    // Add more normal plans as needed
  ];

  const elitePlans = [
    {
      planName: 'Royal Black',
      price: 35,
      features: ['15 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'PERFECT for all your communication needs',
      popularPlan: false, // Example: No popular plan flag for this plan
    },
    {
      planName: 'Smart King',
      price: 45,
      features: ['20 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'SpicALOT Stream, play, talk everywhere',
      popularPlan: false, // Example: No popular plan flag for this plan
    },
    {
      planName: 'Smart King2',
      price: 60,
      features: ['20 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'SpicALOT Stream, play, talk everywhere',
      popularPlan: true, // Example: Popular plan flag for this plan
    },
    {
      planName: 'Smart King -O',
      price: 70,
      features: ['20 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'SpicALOT Stream, play, talk everywhere',
      popularPlan: false, // Example: No popular plan flag for this plan
    },
    // Add more elite plans as needed
  ];

  const gradients = [
    'linear-gradient(to right, #d4fc79, #96e6a1)',  // Light yellow-green to light green
    'linear-gradient(to right, #ffe29f, #ffa99f)',  // Light yellow to light pink
    'linear-gradient(to right, #f6d365, #fda085)',  // Light yellow to light orange
    'linear-gradient(to right, #a8e063, #56ab2f)',  // Light green to darker green
    'linear-gradient(to right, #ffecd2, #fcb69f)',  // Very light yellow to light peach
  ];

  let displayPlans = showNormal ? normalPlans : elitePlans;

  if (!showAll) {
    displayPlans = displayPlans.slice(0, 4);
  }

  return (
    <Box >
      <Typography variant="h4" align="center" gutterBottom>
        Get the best plan
      </Typography>
      <Typography variant="h6" align="center" paragraph>
        Select one of our recommended plans
      </Typography>

      {/* Toggle buttons for Normal Plans and Elite Plans */}
      <Box display="flex" justifyContent="center" marginBottom={2}>
        <Button
          variant="contained"
          onClick={() => {
            setShowNormal(true);
            setShowElite(false);
          }}
          sx={{
            margin: '0 10px',
            backgroundColor: showNormal ? '#8af2ea' : '#fff',
            color: showNormal ? 'black' : '#000',
          }}

        >
          Normal Plans
        </Button>
        <Button
          variant="contained"
          onClick={() => {
            setShowNormal(false);
            setShowElite(true);
          }}
          sx={{
            margin: '0 10px',
            backgroundColor: showElite ? '#8af2ea' : '#fff',
            color: showElite ? 'black' : '#000',
          }}
        >
          Elite Plans
        </Button>
      </Box>

      {/* Display plans based on the active tab */}
      <Grid container spacing={2} justifyContent="center">
        {displayPlans.map((plan, index) => (
          <Grid item xs={12} sm={6} md={4} lg={3} key={index}>
            <BestPlanCardView
              planName={plan.planName}
              price={plan.price}
              features={plan.features}
              tagline={plan.tagline}
              popularPlan={plan.popularPlan}
              style={{ background: gradients[index % gradients.length] }}
              onSelectPlan={handleSelectPlan}
            />
          </Grid>
        ))}
      </Grid>

      {/* Show All Button */}
      {!showAll && (
        <Box display="flex" justifyContent="center" marginTop={2}>
          <Button
            variant="contained"
            onClick={() => setShowAll(true)}
            sx={{

              maxWidth: '1200px',

              backgroundColor: '#8af2ea',
              backgroundImage: 'linear-gradient(to right, #8af2ea, #cdfadd)',
              color: 'black',
            }}
          >
            Show All
          </Button>
        </Box>
      )}
    </Box>
  );
};

export default PlansViewComponent;
