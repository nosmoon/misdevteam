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

public class HD_EVLU_5802_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_frdt;
	public String annc_todt;
	public String annc_clsf;
	public String annc_cont;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_5802_IDM(){}
	public HD_EVLU_5802_IDM(String cmpy_cd, String emp_no, String nm_korn, String dept_cd, String dty_cd, String posi_cd, String pgm_id, String pgm_nm, String pgm_url, String job_clsf, String annc_frdt, String annc_todt, String annc_clsf, String annc_cont, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_url = pgm_url;
		this.job_clsf = job_clsf;
		this.annc_frdt = annc_frdt;
		this.annc_todt = annc_todt;
		this.annc_clsf = annc_clsf;
		this.annc_cont = annc_cont;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAnnc_frdt(String annc_frdt){
		this.annc_frdt = annc_frdt;
	}

	public void setAnnc_todt(String annc_todt){
		this.annc_todt = annc_todt;
	}

	public void setAnnc_clsf(String annc_clsf){
		this.annc_clsf = annc_clsf;
	}

	public void setAnnc_cont(String annc_cont){
		this.annc_cont = annc_cont;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAnnc_frdt(){
		return this.annc_frdt;
	}

	public String getAnnc_todt(){
		return this.annc_todt;
	}

	public String getAnnc_clsf(){
		return this.annc_clsf;
	}

	public String getAnnc_cont(){
		return this.annc_cont;
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

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_5802_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5802_IDM dm = (HD_EVLU_5802_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.nm_korn);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.dty_cd);
		cstmt.setString(8, dm.posi_cd);
		cstmt.setString(9, dm.pgm_id);
		cstmt.setString(10, dm.pgm_nm);
		cstmt.setString(11, dm.pgm_url);
		cstmt.setString(12, dm.job_clsf);
		cstmt.setString(13, dm.annc_frdt);
		cstmt.setString(14, dm.annc_todt);
		cstmt.setString(15, dm.annc_clsf);
		cstmt.setString(16, dm.annc_cont);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.chg_pers);
		cstmt.setString(20, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_5802_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("nm_korn = " + getNm_korn());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dty_cd = " + getDty_cd());
        System.out.println("posi_cd = " + getPosi_cd());
        System.out.println("pgm_id = " + getPgm_id());
        System.out.println("pgm_nm = " + getPgm_nm());
        System.out.println("pgm_url = " + getPgm_url());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("annc_frdt = " + getAnnc_frdt());
        System.out.println("annc_todt = " + getAnnc_todt());
        System.out.println("annc_clsf = " + getAnnc_clsf());
        System.out.println("annc_cont = " + getAnnc_cont());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("flag = " + getFlag());
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String pgm_nm = req.getParameter("pgm_nm");
if( pgm_nm == null){
	System.out.println(this.toString+" : pgm_nm is null" );
}else{
	System.out.println(this.toString+" : pgm_nm is "+pgm_nm );
}
String pgm_url = req.getParameter("pgm_url");
if( pgm_url == null){
	System.out.println(this.toString+" : pgm_url is null" );
}else{
	System.out.println(this.toString+" : pgm_url is "+pgm_url );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String annc_frdt = req.getParameter("annc_frdt");
if( annc_frdt == null){
	System.out.println(this.toString+" : annc_frdt is null" );
}else{
	System.out.println(this.toString+" : annc_frdt is "+annc_frdt );
}
String annc_todt = req.getParameter("annc_todt");
if( annc_todt == null){
	System.out.println(this.toString+" : annc_todt is null" );
}else{
	System.out.println(this.toString+" : annc_todt is "+annc_todt );
}
String annc_clsf = req.getParameter("annc_clsf");
if( annc_clsf == null){
	System.out.println(this.toString+" : annc_clsf is null" );
}else{
	System.out.println(this.toString+" : annc_clsf is "+annc_clsf );
}
String annc_cont = req.getParameter("annc_cont");
if( annc_cont == null){
	System.out.println(this.toString+" : annc_cont is null" );
}else{
	System.out.println(this.toString+" : annc_cont is "+annc_cont );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
String pgm_url = Util.checkString(req.getParameter("pgm_url"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String annc_frdt = Util.checkString(req.getParameter("annc_frdt"));
String annc_todt = Util.checkString(req.getParameter("annc_todt"));
String annc_clsf = Util.checkString(req.getParameter("annc_clsf"));
String annc_cont = Util.checkString(req.getParameter("annc_cont"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String pgm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_nm")));
String pgm_url = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_url")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String annc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_frdt")));
String annc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_todt")));
String annc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_clsf")));
String annc_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_cont")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setNm_korn(nm_korn);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setPgm_id(pgm_id);
dm.setPgm_nm(pgm_nm);
dm.setPgm_url(pgm_url);
dm.setJob_clsf(job_clsf);
dm.setAnnc_frdt(annc_frdt);
dm.setAnnc_todt(annc_todt);
dm.setAnnc_clsf(annc_clsf);
dm.setAnnc_cont(annc_cont);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 16:10:21 KST 2009 */