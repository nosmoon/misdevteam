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


package chosun.ciis.hd.corr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.corr.ds.*;
import chosun.ciis.hd.corr.rec.*;

/**
 * 
 */


public class HD_CORR_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_yymm;
	public String proc_stat;

	public HD_CORR_1100_LDM(){}
	public HD_CORR_1100_LDM(String cmpy_cd, String pay_yymm, String proc_stat){
		this.cmpy_cd = cmpy_cd;
		this.pay_yymm = pay_yymm;
		this.proc_stat = proc_stat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CORR_1100_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CORR_1100_LDM dm = (HD_CORR_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pay_yymm);
		cstmt.setString(5, dm.proc_stat);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.corr.ds.HD_CORR_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pay_yymm = [" + getPay_yymm() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String pay_yymm = req.getParameter("pay_yymm");
if( pay_yymm == null){
	System.out.println(this.toString+" : pay_yymm is null" );
}else{
	System.out.println(this.toString+" : pay_yymm is "+pay_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pay_yymm = Util.checkString(req.getParameter("pay_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPay_yymm(pay_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 15:40:30 KST 2009 */