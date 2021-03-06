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

public class HD_EVLU_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_obj_bgn_dd;
	public String evlu_obj_end_dd;
	public String evlu_excl_dd;
	public String evlu_excl_daycnt;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_1002_ADM(){}
	public HD_EVLU_1002_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_obj_bgn_dd, String evlu_obj_end_dd, String evlu_excl_dd, String evlu_excl_daycnt, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_obj_bgn_dd = evlu_obj_bgn_dd;
		this.evlu_obj_end_dd = evlu_obj_end_dd;
		this.evlu_excl_dd = evlu_excl_dd;
		this.evlu_excl_daycnt = evlu_excl_daycnt;
		this.remk = remk;
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

	public void setEvlu_obj_bgn_dd(String evlu_obj_bgn_dd){
		this.evlu_obj_bgn_dd = evlu_obj_bgn_dd;
	}

	public void setEvlu_obj_end_dd(String evlu_obj_end_dd){
		this.evlu_obj_end_dd = evlu_obj_end_dd;
	}

	public void setEvlu_excl_dd(String evlu_excl_dd){
		this.evlu_excl_dd = evlu_excl_dd;
	}

	public void setEvlu_excl_daycnt(String evlu_excl_daycnt){
		this.evlu_excl_daycnt = evlu_excl_daycnt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getEvlu_obj_bgn_dd(){
		return this.evlu_obj_bgn_dd;
	}

	public String getEvlu_obj_end_dd(){
		return this.evlu_obj_end_dd;
	}

	public String getEvlu_excl_dd(){
		return this.evlu_excl_dd;
	}

	public String getEvlu_excl_daycnt(){
		return this.evlu_excl_daycnt;
	}

	public String getRemk(){
		return this.remk;
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
		 return "{ call MISHDL.SP_HD_EVLU_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_1002_ADM dm = (HD_EVLU_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_obj_bgn_dd);
		cstmt.setString(7, dm.evlu_obj_end_dd);
		cstmt.setString(8, dm.evlu_excl_dd);
		cstmt.setString(9, dm.evlu_excl_daycnt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.chg_pers);
		cstmt.setString(14, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_1002_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evlu_yy = " + getEvlu_yy());
        System.out.println("tms_clsf = " + getTms_clsf());
        System.out.println("evlu_obj_bgn_dd = " + getEvlu_obj_bgn_dd());
        System.out.println("evlu_obj_end_dd = " + getEvlu_obj_end_dd());
        System.out.println("evlu_excl_dd = " + getEvlu_excl_dd());
        System.out.println("evlu_excl_daycnt = " + getEvlu_excl_daycnt());
        System.out.println("remk = " + getRemk());
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
String evlu_obj_bgn_dd = req.getParameter("evlu_obj_bgn_dd");
if( evlu_obj_bgn_dd == null){
	System.out.println(this.toString+" : evlu_obj_bgn_dd is null" );
}else{
	System.out.println(this.toString+" : evlu_obj_bgn_dd is "+evlu_obj_bgn_dd );
}
String evlu_obj_end_dd = req.getParameter("evlu_obj_end_dd");
if( evlu_obj_end_dd == null){
	System.out.println(this.toString+" : evlu_obj_end_dd is null" );
}else{
	System.out.println(this.toString+" : evlu_obj_end_dd is "+evlu_obj_end_dd );
}
String evlu_excl_dd = req.getParameter("evlu_excl_dd");
if( evlu_excl_dd == null){
	System.out.println(this.toString+" : evlu_excl_dd is null" );
}else{
	System.out.println(this.toString+" : evlu_excl_dd is "+evlu_excl_dd );
}
String evlu_excl_daycnt = req.getParameter("evlu_excl_daycnt");
if( evlu_excl_daycnt == null){
	System.out.println(this.toString+" : evlu_excl_daycnt is null" );
}else{
	System.out.println(this.toString+" : evlu_excl_daycnt is "+evlu_excl_daycnt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String evlu_obj_bgn_dd = Util.checkString(req.getParameter("evlu_obj_bgn_dd"));
String evlu_obj_end_dd = Util.checkString(req.getParameter("evlu_obj_end_dd"));
String evlu_excl_dd = Util.checkString(req.getParameter("evlu_excl_dd"));
String evlu_excl_daycnt = Util.checkString(req.getParameter("evlu_excl_daycnt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_obj_bgn_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_obj_bgn_dd")));
String evlu_obj_end_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_obj_end_dd")));
String evlu_excl_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_excl_dd")));
String evlu_excl_daycnt = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_excl_daycnt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
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
dm.setEvlu_obj_bgn_dd(evlu_obj_bgn_dd);
dm.setEvlu_obj_end_dd(evlu_obj_end_dd);
dm.setEvlu_excl_dd(evlu_excl_dd);
dm.setEvlu_excl_daycnt(evlu_excl_daycnt);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 17:23:05 KST 2009 */