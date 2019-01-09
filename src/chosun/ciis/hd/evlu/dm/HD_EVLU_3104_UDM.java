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

public class HD_EVLU_3104_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_pers_emp_no_1tms;
	public String emp_no;
	public String busn_rslt_scor;
	public String evlu_part_cd1;
	public String evlu_part_cd2;
	public String evlu_part_cd3;
	public String evlu_part_cd4;
	public String evlu_part_cd5;
	public String evlu_cmpt_opn_1tms;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_EVLU_3104_UDM(){}
	public HD_EVLU_3104_UDM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_pers_emp_no_1tms, String emp_no, String busn_rslt_scor, String evlu_part_cd1, String evlu_part_cd2, String evlu_part_cd3, String evlu_part_cd4, String evlu_part_cd5, String evlu_cmpt_opn_1tms, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
		this.emp_no = emp_no;
		this.busn_rslt_scor = busn_rslt_scor;
		this.evlu_part_cd1 = evlu_part_cd1;
		this.evlu_part_cd2 = evlu_part_cd2;
		this.evlu_part_cd3 = evlu_part_cd3;
		this.evlu_part_cd4 = evlu_part_cd4;
		this.evlu_part_cd5 = evlu_part_cd5;
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setEvlu_pers_emp_no_1tms(String evlu_pers_emp_no_1tms){
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public void setEvlu_part_cd1(String evlu_part_cd1){
		this.evlu_part_cd1 = evlu_part_cd1;
	}

	public void setEvlu_part_cd2(String evlu_part_cd2){
		this.evlu_part_cd2 = evlu_part_cd2;
	}

	public void setEvlu_part_cd3(String evlu_part_cd3){
		this.evlu_part_cd3 = evlu_part_cd3;
	}

	public void setEvlu_part_cd4(String evlu_part_cd4){
		this.evlu_part_cd4 = evlu_part_cd4;
	}

	public void setEvlu_part_cd5(String evlu_part_cd5){
		this.evlu_part_cd5 = evlu_part_cd5;
	}

	public void setEvlu_cmpt_opn_1tms(String evlu_cmpt_opn_1tms){
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getEvlu_pers_emp_no_1tms(){
		return this.evlu_pers_emp_no_1tms;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}

	public String getEvlu_part_cd1(){
		return this.evlu_part_cd1;
	}

	public String getEvlu_part_cd2(){
		return this.evlu_part_cd2;
	}

	public String getEvlu_part_cd3(){
		return this.evlu_part_cd3;
	}

	public String getEvlu_part_cd4(){
		return this.evlu_part_cd4;
	}

	public String getEvlu_part_cd5(){
		return this.evlu_part_cd5;
	}

	public String getEvlu_cmpt_opn_1tms(){
		return this.evlu_cmpt_opn_1tms;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_3104_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_3104_UDM dm = (HD_EVLU_3104_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_pers_emp_no_1tms);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.busn_rslt_scor);
		cstmt.setString(9, dm.evlu_part_cd1);
		cstmt.setString(10, dm.evlu_part_cd2);
		cstmt.setString(11, dm.evlu_part_cd3);
		cstmt.setString(12, dm.evlu_part_cd4);
		cstmt.setString(13, dm.evlu_part_cd5);
		cstmt.setString(14, dm.evlu_cmpt_opn_1tms);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_3104_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evlu_yy = " + getEvlu_yy());
        System.out.println("tms_clsf = " + getTms_clsf());
        System.out.println("evlu_pers_emp_no_1tms = " + getEvlu_pers_emp_no_1tms());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("busn_rslt_scor = " + getBusn_rslt_scor());
        System.out.println("evlu_part_cd1 = " + getEvlu_part_cd1());
        System.out.println("evlu_part_cd2 = " + getEvlu_part_cd2());
        System.out.println("evlu_part_cd3 = " + getEvlu_part_cd3());
        System.out.println("evlu_part_cd4 = " + getEvlu_part_cd4());
        System.out.println("evlu_part_cd5 = " + getEvlu_part_cd5());
        System.out.println("evlu_cmpt_opn_1tms = " + getEvlu_cmpt_opn_1tms());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String evlu_pers_emp_no_1tms = req.getParameter("evlu_pers_emp_no_1tms");
if( evlu_pers_emp_no_1tms == null){
	System.out.println(this.toString+" : evlu_pers_emp_no_1tms is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_emp_no_1tms is "+evlu_pers_emp_no_1tms );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String busn_rslt_scor = req.getParameter("busn_rslt_scor");
if( busn_rslt_scor == null){
	System.out.println(this.toString+" : busn_rslt_scor is null" );
}else{
	System.out.println(this.toString+" : busn_rslt_scor is "+busn_rslt_scor );
}
String evlu_part_cd1 = req.getParameter("evlu_part_cd1");
if( evlu_part_cd1 == null){
	System.out.println(this.toString+" : evlu_part_cd1 is null" );
}else{
	System.out.println(this.toString+" : evlu_part_cd1 is "+evlu_part_cd1 );
}
String evlu_part_cd2 = req.getParameter("evlu_part_cd2");
if( evlu_part_cd2 == null){
	System.out.println(this.toString+" : evlu_part_cd2 is null" );
}else{
	System.out.println(this.toString+" : evlu_part_cd2 is "+evlu_part_cd2 );
}
String evlu_part_cd3 = req.getParameter("evlu_part_cd3");
if( evlu_part_cd3 == null){
	System.out.println(this.toString+" : evlu_part_cd3 is null" );
}else{
	System.out.println(this.toString+" : evlu_part_cd3 is "+evlu_part_cd3 );
}
String evlu_part_cd4 = req.getParameter("evlu_part_cd4");
if( evlu_part_cd4 == null){
	System.out.println(this.toString+" : evlu_part_cd4 is null" );
}else{
	System.out.println(this.toString+" : evlu_part_cd4 is "+evlu_part_cd4 );
}
String evlu_part_cd5 = req.getParameter("evlu_part_cd5");
if( evlu_part_cd5 == null){
	System.out.println(this.toString+" : evlu_part_cd5 is null" );
}else{
	System.out.println(this.toString+" : evlu_part_cd5 is "+evlu_part_cd5 );
}
String evlu_cmpt_opn_1tms = req.getParameter("evlu_cmpt_opn_1tms");
if( evlu_cmpt_opn_1tms == null){
	System.out.println(this.toString+" : evlu_cmpt_opn_1tms is null" );
}else{
	System.out.println(this.toString+" : evlu_cmpt_opn_1tms is "+evlu_cmpt_opn_1tms );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_pers_emp_no_1tms = Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String busn_rslt_scor = Util.checkString(req.getParameter("busn_rslt_scor"));
String evlu_part_cd1 = Util.checkString(req.getParameter("evlu_part_cd1"));
String evlu_part_cd2 = Util.checkString(req.getParameter("evlu_part_cd2"));
String evlu_part_cd3 = Util.checkString(req.getParameter("evlu_part_cd3"));
String evlu_part_cd4 = Util.checkString(req.getParameter("evlu_part_cd4"));
String evlu_part_cd5 = Util.checkString(req.getParameter("evlu_part_cd5"));
String evlu_cmpt_opn_1tms = Util.checkString(req.getParameter("evlu_cmpt_opn_1tms"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_pers_emp_no_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_emp_no_1tms")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String busn_rslt_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_rslt_scor")));
String evlu_part_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_part_cd1")));
String evlu_part_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_part_cd2")));
String evlu_part_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_part_cd3")));
String evlu_part_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_part_cd4")));
String evlu_part_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_part_cd5")));
String evlu_cmpt_opn_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_cmpt_opn_1tms")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
dm.setEmp_no(emp_no);
dm.setBusn_rslt_scor(busn_rslt_scor);
dm.setEvlu_part_cd1(evlu_part_cd1);
dm.setEvlu_part_cd2(evlu_part_cd2);
dm.setEvlu_part_cd3(evlu_part_cd3);
dm.setEvlu_part_cd4(evlu_part_cd4);
dm.setEvlu_part_cd5(evlu_part_cd5);
dm.setEvlu_cmpt_opn_1tms(evlu_cmpt_opn_1tms);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 03 15:49:19 KST 2009 */