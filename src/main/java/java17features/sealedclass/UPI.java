package java17features.sealedclass;

public sealed class UPI permits Gpay, PhonePay, AmazonPay {

}

 non-sealed class Gpay extends UPI {}
 final class PhonePay extends UPI {}
final class AmazonPay extends UPI {}