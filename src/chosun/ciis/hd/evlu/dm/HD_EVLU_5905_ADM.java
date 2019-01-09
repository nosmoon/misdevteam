/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
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


public class HD_EVLU_5905_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_pers_emp_no;
	public String evlu_pers_gbn;
	public String tgt_evlu_pers_emp_no;
	public String item_cd;
	public String grad_cd;
	public String scor;
	public String evlu_opn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;
	public String tot_evlu;

	public HD_EVLU_5905_ADM(){}
	public HD_EVLU_5905_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_pers_emp_no, String evlu_pers_gbn, String tgt_evlu_pers_emp_no, String item_cd, String grad_cd, String scor, String evlu_opn, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag, String tot_evlu){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_pers_emp_no = evlu_pers_emp_no;
		this.evlu_pers_gbn = evlu_pers_gbn;
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
		this.item_cd = item_cd;
		this.grad_cd = grad_cd;
		this.scor = scor;
		this.evlu_opn = evlu_opn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
		this.tot_evlu = tot_evlu;
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

	public void setEvlu_pers_emp_no(String evlu_pers_emp_no){
		this.evlu_pers_emp_no = evlu_pers_emp_no;
	}

	public void setEvlu_pers_gbn(String evlu_pers_gbn){
		this.evlu_pers_gbn = evlu_pers_gbn;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setGrad_cd(String grad_cd){
		this.grad_cd = grad_cd;
	}

	public void setScor(String scor){
		this.scor = scor;
	}

	public void setEvlu_opn(String evlu_opn){
		this.evlu_opn = evlu_opn;
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

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setTot_evlu(String tot_evlu){
		this.tot_evlu = tot_evlu;
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

	public String getEvlu_pers_emp_no(){
		return this.evlu_pers_emp_no;
	}

	public String getEvlu_pers_gbn(){
		return this.evlu_pers_gbn;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getGrad_cd(){
		return this.grad_cd;
	}

	public String getScor(){
		return this.scor;
	}

	public String getEvlu_opn(){
		return this.evlu_opn;
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

	public String getFlag(){
		return this.flag;
	}

	public String getTot_evlu(){
		return this.tot_evlu;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_5905_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5905_ADM dm = (HD_EVLU_5905_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evlu_yy);
		cstmt.setString(6, dm.tms_clsf);
		cstmt.setString(7, dm.evlu_pers_emp_no);
		cstmt.setString(8, dm.evlu_pers_gbn);
		cstmt.setString(9, dm.tgt_evlu_pers_emp_no);
		cstmt.setString(10, dm.item_cd);
		cstmt.setString(11, dm.grad_cd);
		cstmt.setString(12, dm.scor);
		cstmt.setString(13, dm.evlu_opn);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.chg_pers);
		cstmt.setString(17, dm.flag);
		cstmt.setString(18, dm.tot_evlu);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_5905_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_pers_emp_no = [" + getEvlu_pers_emp_no() + "]");
		System.out.println("evlu_pers_gbn = [" + getEvlu_pers_gbn() + "]");
		System.out.println("tgt_evlu_pers_emp_no = [" + getTgt_evlu_pers_emp_no() + "]");
		System.out.println("item_cd = [" + getItem_cd() + "]");
		System.out.println("grad_cd = [" + getGrad_cd() + "]");
		System.out.println("scor = [" + getScor() + "]");
		System.out.println("evlu_opn = [" + getEvlu_opn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("tot_evlu = [" + getTot_evlu() + "]");
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
String evlu_pers_emp_no = req.getParameter("evlu_pers_emp_no");
if( evlu_pers_emp_no == null){
	System.out.println(this.toString+" : evlu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_emp_no is "+evlu_pers_emp_no );
}
String evlu_pers_gbn = req.getParameter("evlu_pers_gbn");
if( evlu_pers_gbn == null){
	System.out.println(this.toString+" : evlu_pers_gbn is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_gbn is "+evlu_pers_gbn );
}
String tgt_evlu_pers_emp_no = req.getParameter("tgt_evlu_pers_emp_no");
if( tgt_evlu_pers_emp_no == null){
	System.out.println(this.toString+" : tgt_evlu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : tgt_evlu_pers_emp_no is "+tgt_evlu_pers_emp_no );
}
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String grad_cd = req.getParameter("grad_cd");
if( grad_cd == null){
	System.out.println(this.toString+" : grad_cd is null" );
}else{
	System.out.println(this.toString+" : grad_cd is "+grad_cd );
}
String scor = req.getParameter("scor");
if( scor == null){
	System.out.println(this.toString+" : scor is null" );
}else{
	System.out.println(this.toString+" : scor is "+scor );
}
String evlu_opn = req.getParameter("evlu_opn");
if( evlu_opn == null){
	System.out.println(this.toString+" : evlu_opn is null" );
}else{
	System.out.println(this.toString+" : evlu_opn is "+evlu_opn );
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String tot_evlu = req.getParameter("tot_evlu");
if( tot_evlu == null){
	System.out.println(this.toString+" : tot_evlu is null" );
}else{
	System.out.println(this.toString+" : tot_evlu is "+tot_evlu );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_pers_emp_no = Util.checkString(req.getParameter("evlu_pers_emp_no"));
String evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));
String tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String grad_cd = Util.checkString(req.getParameter("grad_cd"));
String scor = Util.checkString(req.getParameter("scor"));
String evlu_opn = Util.checkString(req.getParameter("evlu_opn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
String tot_evlu = Util.checkString(req.getParameter("tot_evlu"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_emp_no")));
String evlu_pers_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_gbn")));
String tgt_evlu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tgt_evlu_pers_emp_no")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String grad_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grad_cd")));
String scor = Util.Uni2Ksc(Util.checkString(req.getParameter("scor")));
String evlu_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_opn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String tot_evlu = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_evlu")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_pers_emp_no(evlu_pers_emp_no);
dm.setEvlu_pers_gbn(evlu_pers_gbn);
dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
dm.setItem_cd(item_cd);
dm.setGrad_cd(grad_cd);
dm.setScor(scor);
dm.setEvlu_opn(evlu_opn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
dm.setTot_evlu(tot_evlu);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 11:54:35 KST 2015 */