import React, { useState } from 'react';
import { Button, Dialog, DialogActions, DialogContent, DialogTitle, Typography, TextField, CircularProgress } from '@mui/material';
import { useHistory } from 'react-router-dom';

const PaymentPage = () => {
    const [openConfirmDialog, setOpenConfirmDialog] = useState(false);
    const [openSuccessDialog, setOpenSuccessDialog] = useState(false);
    const [loading, setLoading] = useState(false);
    const history = useHistory();

    const [formData, setFormData] = useState({
        cardNumber: '',
        expiryDate: '',
        cvv: '',
    });

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    }

    const handleFinishClick = () => {
        setOpenConfirmDialog(true);
    };

    const handleConfirmYes = () => {
        setOpenConfirmDialog(false);
        setLoading(true);

        // Simulate a payment process with a timeout
        setTimeout(() => {
            setLoading(false);
            setOpenSuccessDialog(true);
        }, 3000); // 3 seconds delay
    };

    const handleConfirmNo = () => {
        setOpenConfirmDialog(false);
    };

    const handleSuccessClose = () => {
        setOpenSuccessDialog(false);
        history.push('/');
    };

    return (
        <div>
            <Typography variant="h6">Payment</Typography>
            <TextField
                required
                label="Card Number"
                name="cardNumber"
                value={formData.cardNumber}
                onChange={handleChange}
                fullWidth
                margin="normal"
            />
            <TextField
                required
                label="Expiry Date"
                name="expiryDate"
                value={formData.expiryDate}
                onChange={handleChange}
                fullWidth
                margin="normal"
            />
            <TextField
                required
                label="CVV"
                name="cvv"
                value={formData.cvv}
                onChange={handleChange}
                fullWidth
                margin="normal"
            />

            <Button
                variant="contained"
                color="primary"
                onClick={handleFinishClick}
            >
                Checkout
            </Button>

            {/* Payment Confirmation Dialog */}
            <Dialog
                open={openConfirmDialog}
                onClose={() => setOpenConfirmDialog(false)}
            >
                <DialogTitle>Payment Confirmation</DialogTitle>
                <DialogContent>
                    <Typography>Are you sure you want to proceed with the payment?</Typography>
                </DialogContent>
                <DialogActions>
                    <Button onClick={handleConfirmNo} color="primary">
                        No
                    </Button>
                    <Button onClick={handleConfirmYes} color="primary">
                        Yes
                    </Button>
                </DialogActions>
            </Dialog>

            {/* Payment Success Dialog */}
            <Dialog
                open={openSuccessDialog}
                onClose={handleSuccessClose}
            >
                <DialogTitle>Payment Success</DialogTitle>
                <DialogContent>
                    <Typography>Your payment was successful!</Typography>
                </DialogContent>
                <DialogActions>
                    <Button onClick={handleSuccessClose} color="primary">
                        OK
                    </Button>
                </DialogActions>
            </Dialog>

            {/* Loading Indicator Dialog */}
            <Dialog open={loading} onClose={() => { }} disableBackdropClick disableEscapeKeyDown>
                <DialogContent style={{ textAlign: 'center' }}>
                    <CircularProgress />
                    <Typography variant="h6" style={{ marginTop: 20 }}>
                        Processing payment...
                    </Typography>
                </DialogContent>
            </Dialog>
        </div>
    );
};

export default PaymentPage;
