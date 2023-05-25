package interfaces.exemplo2.models.service;

public interface OnlinePaymentService {

    double paymentFee(double amount);
	double interest(double amount, int months);
    
}
