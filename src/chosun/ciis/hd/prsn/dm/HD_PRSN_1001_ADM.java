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


package chosun.ciis.hd.prsn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.ds.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_1001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_link_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_PRSN_1001_ADM(){}
	public HD_PRSN_1001_ADM(String cmpy_cd, String mode, String pgm_id, String pgm_nm, String pgm_url, String job_clsf, String annc_link_clsf, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_url = pgm_url;
		this.job_clsf = job_clsf;
		this.annc_link_clsf = annc_link_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setAnnc_link_clsf(String annc_link_clsf){
		this.annc_link_clsf = annc_link_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
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

	public String getAnnc_link_clsf(){
		return this.annc_link_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRSN_1001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRSN_1001_ADM dm = (HD_PRSN_1001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.pgm_id);
		cstmt.setString(6, dm.pgm_nm);
		cstmt.setString(7, dm.pgm_url);
		cstmt.setString(8, dm.job_clsf);
		cstmt.setString(9, dm.annc_link_clsf);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prsn.ds.HD_PRSN_1001_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("pgm_id = " + getPgm_id());
        System.out.println("pgm_nm = " + getPgm_nm());
        System.out.println("pgm_url = " + getPgm_url());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("annc_link_clsf = " + getAnnc_link_clsf());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String annc_link_clsf = req.getParameter("annc_link_clsf");
if( annc_link_clsf == null){
	System.out.println(this.toString+" : annc_link_clsf is null" );
}else{
	System.out.println(this.toString+" : annc_link_clsf is "+annc_link_clsf );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
String pgm_url = Util.checkString(req.getParameter("pgm_url"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String annc_link_clsf = Util.checkString(req.getParameter("annc_link_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String pgm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_nm")));
String pgm_url = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_url")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String annc_link_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_link_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setPgm_id(pgm_id);
dm.setPgm_nm(pgm_nm);
dm.setPgm_url(pgm_url);
dm.setJob_clsf(job_clsf);
dm.setAnnc_link_clsf(annc_link_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Apr 12 12:46:46 KST 2009 */