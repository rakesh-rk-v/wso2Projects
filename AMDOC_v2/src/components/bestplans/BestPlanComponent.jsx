import React, { useState } from 'react';
import BestPlanCardView from './BestPlanCardView';
import { Button, Paper, Container, Box, Grid, Typography } from '@mui/material';
import { useHistory } from 'react-router-dom';
import * as routes from '../../constants/routes';

const BestPlanComponent = () => {
  const [showAll, setShowAll] = useState(false);
  const [selectedPlan, setSelectedPlan] = useState(null);
  const history = useHistory();

  const handleSelectPlan = (planData) => {
    setSelectedPlan(planData);
    history.push({
      pathname: routes.ORDER_PROCESS, // Adjust based on your route configuration
      state: { selectedPlan: planData } // Pass selectedPlan as state
    });
  };

  const plans = [
    {
      planName: 'SpicaStarter',
      price: 15,
      features: ['1 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'START USING NOW',
      popularPlan: false,
    },
    {
      planName: 'SpicaValue',
      price: 25,
      features: ['8 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'DATA for all day use',
      popularPlan: true,
    },
    {
      planName: 'Royal Black',
      price: 35,
      features: ['15 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'PERFECT FOR all your communication needs',
      popularPlan: false,
    },
    {
      planName: 'Smart King',
      price: 45,
      features: ['20 GB Data', 'Unlimited Minutes', 'Unlimited Texts', '4G and 5G', 'eSIM'],
      tagline: 'SpicALOT Stream, play, talk everywhere',
      popularPlan: true,
    },
    // Add more plans as needed
  ];

  const gradients = [
    'linear-gradient(to right, #d4fc79, #96e6a1)',  // Light yellow-green to light green
    'linear-gradient(to right, #ffe29f, #ffa99f)',  // Light yellow to light pink
    'linear-gradient(to right, #f6d365, #fda085)',  // Light yellow to light orange
    'linear-gradient(to right, #a8e063, #56ab2f)',  // Light green to darker green
    'linear-gradient(to right, #ffecd2, #fcb69f)',  // Very light yellow to light peach
  ];

  const displayPlans = showAll ? plans : plans.slice(0, 4);

  return (
    <Box >
      <Paper sx={{ backgroundColor: '#f9f9f9', padding: 2 }}>
        <Typography variant="h4" align="center">
          Get the best plan
        </Typography>
        <Typography variant="h6" align="center" sx={{ marginBottom: 2 }}>
          Select one of our recommended plans
        </Typography>

        <Grid container spacing={2} justifyContent="center">
          {displayPlans.slice(0, showAll ? undefined : 4).map((plan, index) => (
            <Grid item xs={12} sm={6} md={4} lg={3} key={index}>
              <Box
                sx={{
                  background: gradients[index % gradients.length],
                  borderRadius: '10px',
                  overflow: 'hidden',
                  height: '100%',
                  padding: 2,
                }}
              >
                <BestPlanCardView
                  planName={plan.planName}
                  price={plan.price}
                  features={plan.features}
                  tagline={plan.tagline}
                  popularPlan={plan.popularPlan}
                  onSelectPlan={handleSelectPlan}
                />
              </Box>
            </Grid>
          ))}
        </Grid>

        {!showAll && (
          <Box sx={{ textAlign: 'center', marginTop: 2 }}>
            <Button
              variant="contained"
              onClick={() => setShowAll(true)}
              sx={{
                width: '100%',
                maxWidth: '1200px',
                margin: '0 auto',
                backgroundColor: '#8af2ea',
                backgroundImage: 'linear-gradient(to right, #8af2ea, #cdfadd)',
                color: 'black',
              }}
            >
              Show All
            </Button>
          </Box>
        )}
      </Paper>
    </Box>
  );
};

export default BestPlanComponent;
