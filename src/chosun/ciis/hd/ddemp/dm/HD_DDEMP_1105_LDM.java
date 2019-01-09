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


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1105_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_amt;
	public String cntr_amt;

	public HD_DDEMP_1105_LDM(){}
	public HD_DDEMP_1105_LDM(String cmpy_cd, String pay_amt, String cntr_amt){
		this.cmpy_cd = cmpy_cd;
		this.pay_amt = pay_amt;
		this.cntr_amt = cntr_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}
	
	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
	
	public String getCntr_amt(){
		return this.cntr_amt;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_1105_L(? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_1105_LDM dm = (HD_DDEMP_1105_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pay_amt);
		cstmt.setString(5, dm.cntr_amt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_1105_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("cntr_amt = [" + getCntr_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPay_amt(pay_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 24 16:18:47 KST 2017 */