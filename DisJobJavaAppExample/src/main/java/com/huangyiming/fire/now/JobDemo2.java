package com.huangyiming.fire.now;

import com.huangyiming.disjob.java.bean.SchedulerParam;
import com.huangyiming.disjob.java.core.annotation.JobDec;
import com.huangyiming.disjob.java.job.EJob;
import com.huangyiming.disjob.java.utils.TimeUtils;
import com.huangyiming.disjob.quence.TaskExecuteException;

@JobDec(group="huangyiming",jobName="JobDemo2",quartz="0/10 * * * * ?")
public class JobDemo2 implements EJob{

	@Override
	public void beforeExecute(SchedulerParam schedulerParam) {
		
	}

	@Override
	public void execute(SchedulerParam schedulerParam)
			throws TaskExecuteException {
		System.err.println(this.getClass().getName()+"; at time:"+TimeUtils.getFormatNow());
	}

	@Override
	public void executeSuccess(SchedulerParam schedulerParam) {
		
	}

	@Override
	public void executeFail(SchedulerParam schedulerParam) {
		// TODO Auto-generated method stub
		
	}

}
