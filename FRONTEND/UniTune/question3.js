class OtpGenerator {
    constructor() {
        this.otp = 0;
    }   
    generateOtp(){
        this.otp = Math.floor(100000 + Math.random() * 900000);
    }
    getOtp(){
        if(this.otp === 0){
            return "Please generate OTP first";
        }
        return this.otp;
    }

    resetOtp(){
        this.otp=Math.floor(100000+Math.random()*900000);

    }
    verifyOtp(inputOtp){{
        if(inputOtp===this.otp){
            console.log("OTP verification success");  
            console.log("Generated OTP: " + otpGen.getOtp());  
        }
        else{
            console.log("OTP verification failed");
        }
    }
    }
}
const otpGen = new OtpGenerator();
otpGen.generateOtp();
otpGen.verifyOtp(490372);
console.log("Generated OTP: " + otpGen.getOtp()); 

