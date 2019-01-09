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

public class HD_EVLU_1202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_lcls_grp_cd;
	public String evlu_grp_cd;
	public String evlu_grp_nm;
	public String asst_clsf;
	public String evlu_grp_cd_2tms;
	public String spcl_plus_point;
	public String spcl_minus_point;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_1202_ADM(){}
	public HD_EVLU_1202_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_lcls_grp_cd, String evlu_grp_cd, String evlu_grp_nm, String asst_clsf, String evlu_grp_cd_2tms, String spcl_plus_point, String spcl_minus_point, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
		this.evlu_grp_cd = evlu_grp_cd;
		this.evlu_grp_nm = evlu_grp_nm;
		this.asst_clsf = asst_clsf;
		this.evlu_grp_cd_2tms = evlu_grp_cd_2tms;
		this.spcl_plus_point = spcl_plus_point;
		this.spcl_minus_point = spcl_minus_point;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
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

	public void setEvlu_lcls_grp_cd(String evlu_lcls_grp_cd){
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setAsst_clsf(String asst_clsf){
		this.asst_clsf = asst_clsf;
	}

	public void setEvlu_grp_cd_2tms(String evlu_grp_cd_2tms){
		this.evlu_grp_cd_2tms = evlu_grp_cd_2tms;
	}

	public void setSpcl_plus_point(String spcl_plus_point){
		this.spcl_plus_point = spcl_plus_point;
	}

	public void setSpcl_minus_point(String spcl_minus_point){
		this.spcl_minus_point = spcl_minus_point;
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

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_lcls_grp_cd(){
		return this.evlu_lcls_grp_cd;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getAsst_clsf(){
		return this.asst_clsf;
	}

	public String getEvlu_grp_cd_2tms(){
		return this.evlu_grp_cd_2tms;
	}

	public String getSpcl_plus_point(){
		return this.spcl_plus_point;
	}

	public String getSpcl_minus_point(){
		return this.spcl_minus_point;
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
		 return "{ call MISHDL.SP_HD_EVLU_1202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_1202_ADM dm = (HD_EVLU_1202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_lcls_grp_cd);
		cstmt.setString(7, dm.evlu_grp_cd);
		cstmt.setString(8, dm.evlu_grp_nm);
		cstmt.setString(9, dm.asst_clsf);
		cstmt.setString(10, dm.evlu_grp_cd_2tms);
		cstmt.setString(11, dm.spcl_plus_point);
		cstmt.setString(12, dm.spcl_minus_point);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_1202_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evlu_yy = " + getEvlu_yy());
        System.out.println("tms_clsf = " + getTms_clsf());
        System.out.println("evlu_lcls_grp_cd = " + getEvlu_lcls_grp_cd());
        System.out.println("evlu_grp_cd = " + getEvlu_grp_cd());
        System.out.println("evlu_grp_nm = " + getEvlu_grp_nm());
        System.out.println("asst_clsf = " + getAsst_clsf());
        System.out.println("evlu_grp_cd_2tms = " + getEvlu_grp_cd_2tms());
        System.out.println("spcl_plus_point = " + getSpcl_plus_point());
        System.out.println("spcl_minus_point = " + getSpcl_minus_point());
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
String evlu_lcls_grp_cd = req.getParameter("evlu_lcls_grp_cd");
if( evlu_lcls_grp_cd == null){
	System.out.println(this.toString+" : evlu_lcls_grp_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_lcls_grp_cd is "+evlu_lcls_grp_cd );
}
String evlu_grp_cd = req.getParameter("evlu_grp_cd");
if( evlu_grp_cd == null){
	System.out.println(this.toString+" : evlu_grp_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_cd is "+evlu_grp_cd );
}
String evlu_grp_nm = req.getParameter("evlu_grp_nm");
if( evlu_grp_nm == null){
	System.out.println(this.toString+" : evlu_grp_nm is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_nm is "+evlu_grp_nm );
}
String asst_clsf = req.getParameter("asst_clsf");
if( asst_clsf == null){
	System.out.println(this.toString+" : asst_clsf is null" );
}else{
	System.out.println(this.toString+" : asst_clsf is "+asst_clsf );
}
String evlu_grp_cd_2tms = req.getParameter("evlu_grp_cd_2tms");
if( evlu_grp_cd_2tms == null){
	System.out.println(this.toString+" : evlu_grp_cd_2tms is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_cd_2tms is "+evlu_grp_cd_2tms );
}
String spcl_plus_point = req.getParameter("spcl_plus_point");
if( spcl_plus_point == null){
	System.out.println(this.toString+" : spcl_plus_point is null" );
}else{
	System.out.println(this.toString+" : spcl_plus_point is "+spcl_plus_point );
}
String spcl_minus_point = req.getParameter("spcl_minus_point");
if( spcl_minus_point == null){
	System.out.println(this.toString+" : spcl_minus_point is null" );
}else{
	System.out.println(this.toString+" : spcl_minus_point is "+spcl_minus_point );
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
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_lcls_grp_cd = Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
String evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
String evlu_grp_nm = Util.checkString(req.getParameter("evlu_grp_nm"));
String asst_clsf = Util.checkString(req.getParameter("asst_clsf"));
String evlu_grp_cd_2tms = Util.checkString(req.getParameter("evlu_grp_cd_2tms"));
String spcl_plus_point = Util.checkString(req.getParameter("spcl_plus_point"));
String spcl_minus_point = Util.checkString(req.getParameter("spcl_minus_point"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_lcls_grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_lcls_grp_cd")));
String evlu_grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_cd")));
String evlu_grp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_nm")));
String asst_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("asst_clsf")));
String evlu_grp_cd_2tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_cd_2tms")));
String spcl_plus_point = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_plus_point")));
String spcl_minus_point = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_minus_point")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
dm.setEvlu_grp_cd(evlu_grp_cd);
dm.setEvlu_grp_nm(evlu_grp_nm);
dm.setAsst_clsf(asst_clsf);
dm.setEvlu_grp_cd_2tms(evlu_grp_cd_2tms);
dm.setSpcl_plus_point(spcl_plus_point);
dm.setSpcl_minus_point(spcl_minus_point);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 15 18:47:28 KST 2009 */