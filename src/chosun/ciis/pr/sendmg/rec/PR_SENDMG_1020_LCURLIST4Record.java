/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1020_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String jbincode;
	public String jbbalcha;
	public String jbbalcha_jbcode;
	public String jbdotime;
	public String jbdotime_jbcode;

	public PR_SENDMG_1020_LCURLIST4Record(){}

	public void setJbincode(String jbincode){
		this.jbincode = jbincode;
	}

	public void setJbbalcha(String jbbalcha){
		this.jbbalcha = jbbalcha;
	}

	public void setJbbalcha_jbcode(String jbbalcha_jbcode){
		this.jbbalcha_jbcode = jbbalcha_jbcode;
	}

	public void setJbdotime(String jbdotime){
		this.jbdotime = jbdotime;
	}
	
	public void setJbdotime_jbcode(String jbdotime_jbcode){
		this.jbdotime_jbcode = jbdotime_jbcode;
	}

	public String getJbincode(){
		return this.jbincode;
	}
	
	public String getJbbalcha(){
		return this.jbbalcha;
	}

	public String getJbbalcha_jbcode(){
		return this.jbbalcha_jbcode;
	}

	public String getJbdotime(){
		return this.jbdotime;
	}

	public String getJbdotime_jbcode(){
		return this.jbdotime_jbcode;
	}
}

/* 작성시간 : Fri May 22 22:23:22 KST 2009 */