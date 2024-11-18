package ma.ofppt.mvvmarchitecturepattern.viewmodels;

import android.text.TextUtils;
import android.util.Patterns;


import java.util.regex.Pattern;

import ma.ofppt.mvvmarchitecturepattern.model.User;

public class LoginViewModel extends BaseObservable{
    private User user;

    private String successmessage = "Login successful";
    private String errorMessage = "Email or Password in not valid";

    @bindabla
    private String toastMessage = null;

    public String getToastMessage(){
        return toastMessage;
    }
    private void setToastMessage(String toastMessage){
        this.toastMessage=toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @bindable
    public String getUserEmail(){
        return user.getEmail();
    }

    public void setUserEmail(String email){
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserPassword(){
        return user.getPassword();
    }

    public void setUserPassword(String password){
        user.setPassword(password);
        notifyPropertyCahnged(BR.userPassword);
    }
    public LoginViewModel(){
        user=new User("","");
    }
    public void onButtonClicked(){
        if(isValid())
            setToastMessage(successmessage);
        else
            setToastMessage(errorMessage);
    }
    public boolean isValid(){
        return !TextUtils.isEmpty(getUserEmail())&&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches()&&
                getUserPassword().length()>5;
    }

}
