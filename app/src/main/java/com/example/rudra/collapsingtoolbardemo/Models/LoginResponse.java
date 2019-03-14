package com.example.rudra.collapsingtoolbardemo.Models;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class LoginResponse {

    @SerializedName("error")
    @Expose
    private Integer error;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("is_subscribed")
    @Expose
    private Integer isSubscribed;
    @SerializedName("processing_time")
    @Expose
    private ProcessingTime processingTime;
    @SerializedName("photo_error")
    @Expose
    private Integer photoError;
    @SerializedName("http_code")
    @Expose
    private Integer httpCode;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("result_data")
    @Expose
    private ResultData resultData;

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Integer isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public ProcessingTime getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(ProcessingTime processingTime) {
        this.processingTime = processingTime;
    }

    public Integer getPhotoError() {
        return photoError;
    }

    public void setPhotoError(Integer photoError) {
        this.photoError = photoError;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ResultData getResultData() {
        return resultData;
    }

    public void setResultData(ResultData resultData) {
        this.resultData = resultData;
    }

 public static    class ResultData {

        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("fullname")
        @Expose
        private String fullname;
        @SerializedName("birthdate")
        @Expose
        private String birthdate;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("postcode")
        @Expose
        private String postcode;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("preferences")
        @Expose
        private Preferences preferences;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("user_cookie_name")
        @Expose
        private String userCookieName;
        @SerializedName("user_cookie_value")
        @Expose
        private String userCookieValue;
        @SerializedName("profile_image")
        @Expose
        private String profileImage;
        @SerializedName("plan_details")
        @Expose
        private List<Object> planDetails = null;
        @SerializedName("is_loggedin")
        @Expose
        private Integer isLoggedin;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getBirthdate() {
            return birthdate;
        }

        public void setBirthdate(String birthdate) {
            this.birthdate = birthdate;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Preferences getPreferences() {
            return preferences;
        }

        public void setPreferences(Preferences preferences) {
            this.preferences = preferences;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserCookieName() {
            return userCookieName;
        }

        public void setUserCookieName(String userCookieName) {
            this.userCookieName = userCookieName;
        }

        public String getUserCookieValue() {
            return userCookieValue;
        }

        public void setUserCookieValue(String userCookieValue) {
            this.userCookieValue = userCookieValue;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public List<Object> getPlanDetails() {
            return planDetails;
        }

        public void setPlanDetails(List<Object> planDetails) {
            this.planDetails = planDetails;
        }

        public Integer getIsLoggedin() {
            return isLoggedin;
        }

        public void setIsLoggedin(Integer isLoggedin) {
            this.isLoggedin = isLoggedin;
        }

    }


}




