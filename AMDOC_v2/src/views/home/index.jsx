import { ArrowRightOutlined } from '@ant-design/icons';
import { MessageDisplay } from '@/components/common';
import { ProductShowcaseGrid } from '@/components/product';
import { BestPlanComponent, PlansViewComponent } from '@/components/bestplans';
import { CustomPlanComponent } from '@/components/customplans';
import { Container, Grid, Box, Typography, Button, useTheme, useMediaQuery } from '@mui/material';
import { FEATURED_PRODUCTS, RECOMMENDED_PRODUCTS, SHOP } from '@/constants/routes';
import {
  useDocumentTitle, useFeaturedProducts, useRecommendedProducts, useScrollTop
} from '@/hooks';
import bannerImg from '@/images/banner-girl.png';
import bannerImg2 from '@/images/banner-guy.png';
import React from 'react';
import { Link } from 'react-router-dom';
import { Carousel } from 'react-responsive-carousel';
import 'react-responsive-carousel/lib/styles/carousel.min.css';
import { CustomisedPlanSection, FreeTrialSection, WhyEcogreenSection, SentEmailOfferLinkSection, HelpSection, FeaturedBannersSection, CoverageServiceSection } from '@components/customplans';
import { OrderProcessStepsComponent } from '@/components/orderprocess';
import CardView from '@components/Infoview/cardview';
import VerticalTabs from '@components/Infoview/verticaltabs';

const Home = () => {
  useDocumentTitle('AMDOC | Home');
  useScrollTop();

  const {
    featuredProducts,
    fetchFeaturedProducts,
    isLoading: isLoadingFeatured,
    error: errorFeatured
  } = useFeaturedProducts(6);
  const {
    recommendedProducts,
    fetchRecommendedProducts,
    isLoading: isLoadingRecommended,
    error: errorRecommended
  } = useRecommendedProducts(6);

  const theme = useTheme();
  const isSmallScreen = useMediaQuery(theme.breakpoints.down('sm'));
  const isMediumScreen = useMediaQuery(theme.breakpoints.down('md'));
  return (
    <main className="content">
      <div className="home">

        <Carousel>
          <div className="banner">
            <div className="banner-desc">
              <h1 className="text-thin">
                <strong>
                  Discover Digital Readiness and Beyond.
                </strong>

              </h1>
              {/* <p>
                  Buying eyewear should leave you happy and good-looking, with money in your pocket.
                  Glasses, sunglasses, and contacts—we’ve got your eyes covered.
                </p> */}

              <br />
              <Link to={SHOP} className="button" style={{ backgroundColor: 'yellow', borderRadius: '15px', padding: '10px 10px', display: 'inline-block', textDecoration: 'none', color: 'black' }}>
                Buy Now &nbsp;
                <ArrowRightOutlined />
              </Link>
            </div>
            <div className="banner-img" style={{ width: 'auto', height: '400px', padding: '20px' }} ><img src='https://knotsolutions.com/wp-content/uploads/2022/07/Business-and-Technology-Consulting.png' alt="" /></div>
          </div>



          <div className="banner">
            <div className="banner-desc">
              <h1 className="text-thin">
                <strong>See</strong>
                &nbsp;everything with&nbsp;
                <strong>Clarity-banner-2</strong>
              </h1>
              <p>
                Buying eyewear should leave you happy and good-looking, with money in your pocket.
                Glasses, sunglasses, and contacts—we’ve got your eyes covered.
              </p>
              <br />
              <Link to={SHOP} className="button" style={{ backgroundColor: 'yellow', borderRadius: '15px', padding: '10px 10px', display: 'inline-block', textDecoration: 'none', color: 'black' }}>
                Buy Now &nbsp;
                <ArrowRightOutlined />
              </Link>
            </div>
            <div className="banner-img"><img src='http://konect.knotsolutions.com:8080/konect/homecssjsimg/img/slides/camera/slide2/ceocoo.png' alt="" /></div>
          </div>

        </Carousel>


        <Container>
          <BestPlanComponent />
        </Container>

        <Container>

          <Grid container spacing={2} sx={{ mt: 4 }}>
            <Grid item xs={12} md={6}>
              <CustomisedPlanSection />
            </Grid>
            <Grid item xs={12} md={6}>
              <FreeTrialSection />
            </Grid>
          </Grid>
          <WhyEcogreenSection />
          <SentEmailOfferLinkSection />
          <HelpSection />
          <FeaturedBannersSection />
          <CoverageServiceSection />
          <PlansViewComponent />
        </Container>






        {/* <div className="display">
          <div className="display-header">
            <h1>Featured Products</h1>
            <Link to={FEATURED_PRODUCTS}>See All</Link>
          </div>
          {(errorFeatured && !isLoadingFeatured) ? (
            <MessageDisplay
              message={errorFeatured}
              action={fetchFeaturedProducts}
              buttonLabel="Try Again"
            />
          ) : (
            <ProductShowcaseGrid
              products={featuredProducts}
              skeletonCount={6}
            />
          )}
        </div> */}



        {/* <div className="display">
          <div className="display-header">
            <h1>Recommended Products</h1>
            <Link to={RECOMMENDED_PRODUCTS}>See All</Link>
          </div>
          {(errorRecommended && !isLoadingRecommended) ? (
            <MessageDisplay
              message={errorRecommended}
              action={fetchRecommendedProducts}
              buttonLabel="Try Again"
            />
          ) : (
            <ProductShowcaseGrid
              products={recommendedProducts}
              skeletonCount={6}
            />
          )}
        </div> */}
      </div>
    </main>
  );
};

export default Home;
