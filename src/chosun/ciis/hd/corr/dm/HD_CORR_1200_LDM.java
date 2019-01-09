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


public class HD_CORR_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_pay_yymm;
	public String to_pay_yymm;
	public String natn_cd;
	public String duty_area;

	public HD_CORR_1200_LDM(){}
	public HD_CORR_1200_LDM(String cmpy_cd, String fr_pay_yymm, String to_pay_yymm, String natn_cd, String duty_area){
		this.cmpy_cd = cmpy_cd;
		this.fr_pay_yymm = fr_pay_yymm;
		this.to_pay_yymm = to_pay_yymm;
		this.natn_cd = natn_cd;
		this.duty_area = duty_area;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_pay_yymm(String fr_pay_yymm){
		this.fr_pay_yymm = fr_pay_yymm;
	}

	public void setTo_pay_yymm(String to_pay_yymm){
		this.to_pay_yymm = to_pay_yymm;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_pay_yymm(){
		return this.fr_pay_yymm;
	}

	public String getTo_pay_yymm(){
		return this.to_pay_yymm;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CORR_1200_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CORR_1200_LDM dm = (HD_CORR_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_pay_yymm);
		cstmt.setString(5, dm.to_pay_yymm);
		cstmt.setString(6, dm.natn_cd);
		cstmt.setString(7, dm.duty_area);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.corr.ds.HD_CORR_1200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_pay_yymm = [" + getFr_pay_yymm() + "]");
		System.out.println("to_pay_yymm = [" + getTo_pay_yymm() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("duty_area = [" + getDuty_area() + "]");
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
String fr_pay_yymm = req.getParameter("fr_pay_yymm");
if( fr_pay_yymm == null){
	System.out.println(this.toString+" : fr_pay_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_pay_yymm is "+fr_pay_yymm );
}
String to_pay_yymm = req.getParameter("to_pay_yymm");
if( to_pay_yymm == null){
	System.out.println(this.toString+" : to_pay_yymm is null" );
}else{
	System.out.println(this.toString+" : to_pay_yymm is "+to_pay_yymm );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String duty_area = req.getParameter("duty_area");
if( duty_area == null){
	System.out.println(this.toString+" : duty_area is null" );
}else{
	System.out.println(this.toString+" : duty_area is "+duty_area );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_pay_yymm = Util.checkString(req.getParameter("fr_pay_yymm"));
String to_pay_yymm = Util.checkString(req.getParameter("to_pay_yymm"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String duty_area = Util.checkString(req.getParameter("duty_area"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_pay_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_pay_yymm")));
String to_pay_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_pay_yymm")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String duty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_area")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_pay_yymm(fr_pay_yymm);
dm.setTo_pay_yymm(to_pay_yymm);
dm.setNatn_cd(natn_cd);
dm.setDuty_area(duty_area);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 10:02:19 KST 2009 */