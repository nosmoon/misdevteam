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


package chosun.ciis.hd.crcl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.ds.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String paty_crc_cd;
	public String bgn_dty_cd;
	public String end_dty_cd;
	public String fix_fix_rate_clsf;
	public String rgla_dduc_dus;
	public String rgla_dduc_ratio;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_CRCL_1002_ADM(){}
	public HD_CRCL_1002_ADM(String mode, String cmpy_cd, String paty_crc_cd, String bgn_dty_cd, String end_dty_cd, String fix_fix_rate_clsf, String rgla_dduc_dus, String rgla_dduc_ratio, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.paty_crc_cd = paty_crc_cd;
		this.bgn_dty_cd = bgn_dty_cd;
		this.end_dty_cd = end_dty_cd;
		this.fix_fix_rate_clsf = fix_fix_rate_clsf;
		this.rgla_dduc_dus = rgla_dduc_dus;
		this.rgla_dduc_ratio = rgla_dduc_ratio;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setBgn_dty_cd(String bgn_dty_cd){
		this.bgn_dty_cd = bgn_dty_cd;
	}

	public void setEnd_dty_cd(String end_dty_cd){
		this.end_dty_cd = end_dty_cd;
	}

	public void setFix_fix_rate_clsf(String fix_fix_rate_clsf){
		this.fix_fix_rate_clsf = fix_fix_rate_clsf;
	}

	public void setRgla_dduc_dus(String rgla_dduc_dus){
		this.rgla_dduc_dus = rgla_dduc_dus;
	}

	public void setRgla_dduc_ratio(String rgla_dduc_ratio){
		this.rgla_dduc_ratio = rgla_dduc_ratio;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getBgn_dty_cd(){
		return this.bgn_dty_cd;
	}

	public String getEnd_dty_cd(){
		return this.end_dty_cd;
	}

	public String getFix_fix_rate_clsf(){
		return this.fix_fix_rate_clsf;
	}

	public String getRgla_dduc_dus(){
		return this.rgla_dduc_dus;
	}

	public String getRgla_dduc_ratio(){
		return this.rgla_dduc_ratio;
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
		 return "{ call MISHDL.SP_HD_CRCL_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CRCL_1002_ADM dm = (HD_CRCL_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.paty_crc_cd);
		cstmt.setString(6, dm.bgn_dty_cd);
		cstmt.setString(7, dm.end_dty_cd);
		cstmt.setString(8, dm.fix_fix_rate_clsf);
		cstmt.setString(9, dm.rgla_dduc_dus);
		cstmt.setString(10, dm.rgla_dduc_ratio);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.crcl.ds.HD_CRCL_1002_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("paty_crc_cd = " + getPaty_crc_cd());
        System.out.println("bgn_dty_cd = " + getBgn_dty_cd());
        System.out.println("end_dty_cd = " + getEnd_dty_cd());
        System.out.println("fix_fix_rate_clsf = " + getFix_fix_rate_clsf());
        System.out.println("rgla_dduc_dus = " + getRgla_dduc_dus());
        System.out.println("rgla_dduc_ratio = " + getRgla_dduc_ratio());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String paty_crc_cd = req.getParameter("paty_crc_cd");
if( paty_crc_cd == null){
	System.out.println(this.toString+" : paty_crc_cd is null" );
}else{
	System.out.println(this.toString+" : paty_crc_cd is "+paty_crc_cd );
}
String bgn_dty_cd = req.getParameter("bgn_dty_cd");
if( bgn_dty_cd == null){
	System.out.println(this.toString+" : bgn_dty_cd is null" );
}else{
	System.out.println(this.toString+" : bgn_dty_cd is "+bgn_dty_cd );
}
String end_dty_cd = req.getParameter("end_dty_cd");
if( end_dty_cd == null){
	System.out.println(this.toString+" : end_dty_cd is null" );
}else{
	System.out.println(this.toString+" : end_dty_cd is "+end_dty_cd );
}
String fix_fix_rate_clsf = req.getParameter("fix_fix_rate_clsf");
if( fix_fix_rate_clsf == null){
	System.out.println(this.toString+" : fix_fix_rate_clsf is null" );
}else{
	System.out.println(this.toString+" : fix_fix_rate_clsf is "+fix_fix_rate_clsf );
}
String rgla_dduc_dus = req.getParameter("rgla_dduc_dus");
if( rgla_dduc_dus == null){
	System.out.println(this.toString+" : rgla_dduc_dus is null" );
}else{
	System.out.println(this.toString+" : rgla_dduc_dus is "+rgla_dduc_dus );
}
String rgla_dduc_ratio = req.getParameter("rgla_dduc_ratio");
if( rgla_dduc_ratio == null){
	System.out.println(this.toString+" : rgla_dduc_ratio is null" );
}else{
	System.out.println(this.toString+" : rgla_dduc_ratio is "+rgla_dduc_ratio );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
String bgn_dty_cd = Util.checkString(req.getParameter("bgn_dty_cd"));
String end_dty_cd = Util.checkString(req.getParameter("end_dty_cd"));
String fix_fix_rate_clsf = Util.checkString(req.getParameter("fix_fix_rate_clsf"));
String rgla_dduc_dus = Util.checkString(req.getParameter("rgla_dduc_dus"));
String rgla_dduc_ratio = Util.checkString(req.getParameter("rgla_dduc_ratio"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paty_crc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_crc_cd")));
String bgn_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_dty_cd")));
String end_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dty_cd")));
String fix_fix_rate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_fix_rate_clsf")));
String rgla_dduc_dus = Util.Uni2Ksc(Util.checkString(req.getParameter("rgla_dduc_dus")));
String rgla_dduc_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("rgla_dduc_ratio")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setPaty_crc_cd(paty_crc_cd);
dm.setBgn_dty_cd(bgn_dty_cd);
dm.setEnd_dty_cd(end_dty_cd);
dm.setFix_fix_rate_clsf(fix_fix_rate_clsf);
dm.setRgla_dduc_dus(rgla_dduc_dus);
dm.setRgla_dduc_ratio(rgla_dduc_ratio);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 19:48:15 KST 2009 */