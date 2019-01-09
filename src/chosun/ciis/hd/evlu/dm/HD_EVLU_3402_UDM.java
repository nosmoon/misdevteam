/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 *
 */

public class HD_EVLU_3402_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String emp_no;
	public String evlu_pers_meda_opn_2tms;
	public String evlu_pers_deci_grad_2tms;
	public String chg_pers;

	public HD_EVLU_3402_UDM(){}
	public HD_EVLU_3402_UDM(String cmpy_cd, String evlu_yy, String tms_clsf, String emp_no, String evlu_pers_meda_opn_2tms, String evlu_pers_deci_grad_2tms, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.emp_no = emp_no;
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEvlu_pers_meda_opn_2tms(String evlu_pers_meda_opn_2tms){
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
	}

	public void setEvlu_pers_deci_grad_2tms(String evlu_pers_deci_grad_2tms){
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
	}
	
	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEvlu_pers_meda_opn_2tms(){
		return this.evlu_pers_meda_opn_2tms;
	}

	public String getEvlu_pers_deci_grad_2tms(){
		return this.evlu_pers_deci_grad_2tms;
	}
	
	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_3402_U(? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_3402_UDM dm = (HD_EVLU_3402_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.evlu_pers_meda_opn_2tms);
		cstmt.setString(8, dm.evlu_pers_deci_grad_2tms);
		cstmt.setString(9, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_3402_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evlu_yy = " + getEvlu_yy());
        System.out.println("tms_clsf = " + getTms_clsf());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("evlu_pers_meda_opn_2tms = " + getEvlu_pers_meda_opn_2tms());
        System.out.println("evlu_pers_deci_grad_2tms = " + getEvlu_pers_deci_grad_2tms());
        System.out.println("chg_pers = " + getChg_pers());
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String evlu_pers_meda_opn_2tms = req.getParameter("evlu_pers_meda_opn_2tms");
if( evlu_pers_meda_opn_2tms == null){
	System.out.println(this.toString+" : evlu_pers_meda_opn_2tms is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_meda_opn_2tms is "+evlu_pers_meda_opn_2tms );
}
String evlu_pers_deci_grad_2tms = req.getParameter("evlu_pers_deci_grad_2tms");
if( evlu_pers_deci_grad_2tms == null){
	System.out.println(this.toString+" : evlu_pers_deci_grad_2tms is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_deci_grad_2tms is "+evlu_pers_deci_grad_2tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String evlu_pers_meda_opn_2tms = Util.checkString(req.getParameter("evlu_pers_meda_opn_2tms"));
String evlu_pers_deci_grad_2tms = Util.checkString(req.getParameter("evlu_pers_deci_grad_2tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String evlu_pers_meda_opn_2tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_meda_opn_2tms")));
String evlu_pers_deci_grad_2tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_deci_grad_2tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEmp_no(emp_no);
dm.setEvlu_pers_meda_opn_2tms(evlu_pers_meda_opn_2tms);
dm.setEvlu_pers_deci_grad_2tms(evlu_pers_deci_grad_2tms);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 31 11:23:11 KST 2009 */