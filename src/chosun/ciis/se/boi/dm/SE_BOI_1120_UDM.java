/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1120_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String yymm;
	public String area_cd;
	public long srt_num;
	public String mode_ar;
	public String bo_cd_ar;
	public String chg_prv_area_cd_ar;
	public String chg_prv_srt_seq_ar;
	public String chg_aft_area_cd_ar;
	public String chg_aft_srt_seq_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1120_UDM(){}
	public SE_BOI_1120_UDM(String accflag, String cmpy_cd, String yymm, String area_cd, long srt_num, String mode_ar, String bo_cd_ar, String chg_prv_area_cd_ar, String chg_prv_srt_seq_ar, String chg_aft_area_cd_ar, String chg_aft_srt_seq_ar, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.area_cd = area_cd;
		this.srt_num = srt_num;
		this.mode_ar = mode_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.chg_prv_area_cd_ar = chg_prv_area_cd_ar;
		this.chg_prv_srt_seq_ar = chg_prv_srt_seq_ar;
		this.chg_aft_area_cd_ar = chg_aft_area_cd_ar;
		this.chg_aft_srt_seq_ar = chg_aft_srt_seq_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setSrt_num(long srt_num){
		this.srt_num = srt_num;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setChg_prv_area_cd_ar(String chg_prv_area_cd_ar){
		this.chg_prv_area_cd_ar = chg_prv_area_cd_ar;
	}

	public void setChg_prv_srt_seq_ar(String chg_prv_srt_seq_ar){
		this.chg_prv_srt_seq_ar = chg_prv_srt_seq_ar;
	}

	public void setChg_aft_area_cd_ar(String chg_aft_area_cd_ar){
		this.chg_aft_area_cd_ar = chg_aft_area_cd_ar;
	}

	public void setChg_aft_srt_seq_ar(String chg_aft_srt_seq_ar){
		this.chg_aft_srt_seq_ar = chg_aft_srt_seq_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public long getSrt_num(){
		return this.srt_num;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getChg_prv_area_cd_ar(){
		return this.chg_prv_area_cd_ar;
	}

	public String getChg_prv_srt_seq_ar(){
		return this.chg_prv_srt_seq_ar;
	}

	public String getChg_aft_area_cd_ar(){
		return this.chg_aft_area_cd_ar;
	}

	public String getChg_aft_srt_seq_ar(){
		return this.chg_aft_srt_seq_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1120_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1120_UDM dm = (SE_BOI_1120_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.area_cd);
		cstmt.setLong(7, dm.srt_num);
		cstmt.setString(8, dm.mode_ar);
		cstmt.setString(9, dm.bo_cd_ar);
		cstmt.setString(10, dm.chg_prv_area_cd_ar);
		cstmt.setString(11, dm.chg_prv_srt_seq_ar);
		cstmt.setString(12, dm.chg_aft_area_cd_ar);
		cstmt.setString(13, dm.chg_aft_srt_seq_ar);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1120_UDataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("srt_num = " + getSrt_num());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cd_ar = " + getBo_cd_ar());
        System.out.println("chg_prv_area_cd_ar = " + getChg_prv_area_cd_ar());
        System.out.println("chg_prv_srt_seq_ar = " + getChg_prv_srt_seq_ar());
        System.out.println("chg_aft_area_cd_ar = " + getChg_aft_area_cd_ar());
        System.out.println("chg_aft_srt_seq_ar = " + getChg_aft_srt_seq_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String srt_num = req.getParameter("srt_num");
if( srt_num == null){
	System.out.println(this.toString+" : srt_num is null" );
}else{
	System.out.println(this.toString+" : srt_num is "+srt_num );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cd_ar = req.getParameter("bo_cd_ar");
if( bo_cd_ar == null){
	System.out.println(this.toString+" : bo_cd_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cd_ar is "+bo_cd_ar );
}
String chg_prv_area_cd_ar = req.getParameter("chg_prv_area_cd_ar");
if( chg_prv_area_cd_ar == null){
	System.out.println(this.toString+" : chg_prv_area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : chg_prv_area_cd_ar is "+chg_prv_area_cd_ar );
}
String chg_prv_srt_seq_ar = req.getParameter("chg_prv_srt_seq_ar");
if( chg_prv_srt_seq_ar == null){
	System.out.println(this.toString+" : chg_prv_srt_seq_ar is null" );
}else{
	System.out.println(this.toString+" : chg_prv_srt_seq_ar is "+chg_prv_srt_seq_ar );
}
String chg_aft_area_cd_ar = req.getParameter("chg_aft_area_cd_ar");
if( chg_aft_area_cd_ar == null){
	System.out.println(this.toString+" : chg_aft_area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : chg_aft_area_cd_ar is "+chg_aft_area_cd_ar );
}
String chg_aft_srt_seq_ar = req.getParameter("chg_aft_srt_seq_ar");
if( chg_aft_srt_seq_ar == null){
	System.out.println(this.toString+" : chg_aft_srt_seq_ar is null" );
}else{
	System.out.println(this.toString+" : chg_aft_srt_seq_ar is "+chg_aft_srt_seq_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String srt_num = Util.checkString(req.getParameter("srt_num"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String chg_prv_area_cd_ar = Util.checkString(req.getParameter("chg_prv_area_cd_ar"));
String chg_prv_srt_seq_ar = Util.checkString(req.getParameter("chg_prv_srt_seq_ar"));
String chg_aft_area_cd_ar = Util.checkString(req.getParameter("chg_aft_area_cd_ar"));
String chg_aft_srt_seq_ar = Util.checkString(req.getParameter("chg_aft_srt_seq_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String srt_num = Util.Uni2Ksc(Util.checkString(req.getParameter("srt_num")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String chg_prv_area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_area_cd_ar")));
String chg_prv_srt_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_srt_seq_ar")));
String chg_aft_area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_area_cd_ar")));
String chg_aft_srt_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_srt_seq_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setArea_cd(area_cd);
dm.setSrt_num(srt_num);
dm.setMode_ar(mode_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setChg_prv_area_cd_ar(chg_prv_area_cd_ar);
dm.setChg_prv_srt_seq_ar(chg_prv_srt_seq_ar);
dm.setChg_aft_area_cd_ar(chg_aft_area_cd_ar);
dm.setChg_aft_srt_seq_ar(chg_aft_srt_seq_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 17:28:53 KST 2009 */