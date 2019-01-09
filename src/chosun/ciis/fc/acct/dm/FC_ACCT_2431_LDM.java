/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :   
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2431_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dept_cd;
	public String clam_dept_part_cd;
	public String impt_expn_clsf;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;

	public FC_ACCT_2431_LDM(){}
	public FC_ACCT_2431_LDM(String cmpy_cd, String clam_dept_cd, String clam_dept_part_cd, String impt_expn_clsf, String slip_occr_dt_fr, String slip_occr_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.clam_dept_part_cd = clam_dept_part_cd;
		this.impt_expn_clsf = impt_expn_clsf;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setClam_dept_part_cd(String clam_dept_part_cd){
		this.clam_dept_part_cd = clam_dept_part_cd;
	}

	public void setImpt_expn_clsf(String impt_expn_clsf){
		this.impt_expn_clsf = impt_expn_clsf;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getClam_dept_part_cd(){
		return this.clam_dept_part_cd;
	}

	public String getImpt_expn_clsf(){
		return this.impt_expn_clsf;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2431_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2431_LDM dm = (FC_ACCT_2431_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dept_cd);
		cstmt.setString(5, dm.clam_dept_part_cd);
		cstmt.setString(6, dm.impt_expn_clsf);
		cstmt.setString(7, dm.slip_occr_dt_fr);
		cstmt.setString(8, dm.slip_occr_dt_to);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2431_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("clam_dept_cd = " + getClam_dept_cd());
        System.out.println("clam_dept_part_cd = " + getClam_dept_part_cd());
        System.out.println("impt_expn_clsf = " + getImpt_expn_clsf());
        System.out.println("slip_occr_dt_fr = " + getSlip_occr_dt_fr());
        System.out.println("slip_occr_dt_to = " + getSlip_occr_dt_to());
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
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String clam_dept_part_cd = req.getParameter("clam_dept_part_cd");
if( clam_dept_part_cd == null){
	System.out.println(this.toString+" : clam_dept_part_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_part_cd is "+clam_dept_part_cd );
}
String impt_expn_clsf = req.getParameter("impt_expn_clsf");
if( impt_expn_clsf == null){
	System.out.println(this.toString+" : impt_expn_clsf is null" );
}else{
	System.out.println(this.toString+" : impt_expn_clsf is "+impt_expn_clsf );
}
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String clam_dept_part_cd = Util.checkString(req.getParameter("clam_dept_part_cd"));
String impt_expn_clsf = Util.checkString(req.getParameter("impt_expn_clsf"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String clam_dept_part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_part_cd")));
String impt_expn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_expn_clsf")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setClam_dept_part_cd(clam_dept_part_cd);
dm.setImpt_expn_clsf(impt_expn_clsf);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 17:50:51 KST 2009 */