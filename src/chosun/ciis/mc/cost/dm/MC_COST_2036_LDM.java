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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2036_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String clos_mm;
	public String slip_dtls_clas;

	public MC_COST_2036_LDM(){}
	public MC_COST_2036_LDM(String cmpy_cd, String slip_clsf_cd, String clos_mm, String slip_dtls_clas){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.clos_mm = clos_mm;
		this.slip_dtls_clas = slip_dtls_clas;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public void setSlip_dtls_clas(String slip_dtls_clas){
		this.slip_dtls_clas = slip_dtls_clas;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}

	public String getSlip_dtls_clas(){
		return this.slip_dtls_clas;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2036_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2036_LDM dm = (MC_COST_2036_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.clos_mm);
		cstmt.setString(6, dm.slip_dtls_clas);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2036_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("clos_mm = [" + getClos_mm() + "]");
		System.out.println("slip_dtls_clas = [" + getSlip_dtls_clas() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String clos_mm = req.getParameter("clos_mm");
if( clos_mm == null){
	System.out.println(this.toString+" : clos_mm is null" );
}else{
	System.out.println(this.toString+" : clos_mm is "+clos_mm );
}
String slip_dtls_clas = req.getParameter("slip_dtls_clas");
if( slip_dtls_clas == null){
	System.out.println(this.toString+" : slip_dtls_clas is null" );
}else{
	System.out.println(this.toString+" : slip_dtls_clas is "+slip_dtls_clas );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String clos_mm = Util.checkString(req.getParameter("clos_mm"));
String slip_dtls_clas = Util.checkString(req.getParameter("slip_dtls_clas"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String clos_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_mm")));
String slip_dtls_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_dtls_clas")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setClos_mm(clos_mm);
dm.setSlip_dtls_clas(slip_dtls_clas);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 15:26:36 KST 2009 */