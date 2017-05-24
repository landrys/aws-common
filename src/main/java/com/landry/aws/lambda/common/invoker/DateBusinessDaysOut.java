package com.landry.aws.lambda.common.invoker;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.landry.aws.lambda.common.model.BusinessDayInput;
import com.landry.aws.lambda.common.model.BusinessDayOutput;

public interface DateBusinessDaysOut
{
  @LambdaFunction(functionName="dateBusinessDaysOut")
  BusinessDayOutput dateBusinessDaysOut(BusinessDayInput input);
}