package com.sadiqrazasyed.spreadsheetinput;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpreadsheetWebService {

    @POST("1FAIpQLSd9jl6cAH5h8wmwFok8xh-ECLLpXWTqUopgzmNBQM5_xt3VMw/formResponse")
    @FormUrlEncoded
    Call<Void> feedbackSend(
        @Field("entry.1942285924") String feedback,
        @Field("entry.1133595447") String name,
        @Field("entry.414154651") String email
    );

}
