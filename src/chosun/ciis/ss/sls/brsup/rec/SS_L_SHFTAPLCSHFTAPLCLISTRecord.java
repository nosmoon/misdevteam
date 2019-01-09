/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
* 작성일자 :2009/05/20 
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
 */

public class SS_L_SHFTAPLCSHFTAPLCLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sysid;
	public String svctype;
	public String aplcclsf;
	public String basidt;
	public String aplcdt;
	public String filenm;
	public int datacnt;
	public String procdt;
	public String procpers;
	public String procstat;
	public int proccnt;

	public SS_L_SHFTAPLCSHFTAPLCLISTRecord(){}

	public void setSysid(String sysid){
		this.sysid = sysid;
	}

	public void setSvctype(String svctype){
		this.svctype = svctype;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setDatacnt(int datacnt){
		this.datacnt = datacnt;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProccnt(int proccnt){
		this.proccnt = proccnt;
	}

	public String getSysid(){
		return this.sysid;
	}

	public String getSvctype(){
		return this.svctype;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public int getDatacnt(){
		return this.datacnt;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public int getProccnt(){
		return this.proccnt;
	}
}

/* 작성시간 : Thu May 21 10:43:55 PDT 2009 */