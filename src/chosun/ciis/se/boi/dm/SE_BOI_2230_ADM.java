/***************************************************************************************************
* 파일명 : SE_BOI_2230_ADM.java
* 기능 : 지국관리 - 지국세대등록
* 작성일자 : 2009-05-28
* 작성자 : 이민효
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


public class SE_BOI_2230_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String dong_cd;
	public String yy;
	public String mvin_apt_cnt;
	public String yy_sub;
	public String dong_cd_sub;
	public String mode_sub;
	public String bo_cd;
	public String ratio;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BOI_2230_ADM(){}
	public SE_BOI_2230_ADM(String cmpy_cd, String mode, String dong_cd, String yy, String mvin_apt_cnt, String yy_sub, String dong_cd_sub, String mode_sub, String bo_cd, String ratio, String incmgpers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.dong_cd = dong_cd;
		this.yy = yy;
		this.mvin_apt_cnt = mvin_apt_cnt;
		this.yy_sub = yy_sub;
		this.dong_cd_sub = dong_cd_sub;
		this.mode_sub = mode_sub;
		this.bo_cd = bo_cd;
		this.ratio = ratio;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDong_cd(String dong_cd){
		this.dong_cd = dong_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setMvin_apt_cnt(String mvin_apt_cnt){
		this.mvin_apt_cnt = mvin_apt_cnt;
	}

	public void setYy_sub(String yy_sub){
		this.yy_sub = yy_sub;
	}

	public void setDong_cd_sub(String dong_cd_sub){
		this.dong_cd_sub = dong_cd_sub;
	}

	public void setMode_sub(String mode_sub){
		this.mode_sub = mode_sub;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setRatio(String ratio){
		this.ratio = ratio;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDong_cd(){
		return this.dong_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getMvin_apt_cnt(){
		return this.mvin_apt_cnt;
	}

	public String getYy_sub(){
		return this.yy_sub;
	}

	public String getDong_cd_sub(){
		return this.dong_cd_sub;
	}

	public String getMode_sub(){
		return this.mode_sub;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getRatio(){
		return this.ratio;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_2230_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2230_ADM dm = (SE_BOI_2230_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.dong_cd);
		cstmt.setString(6, dm.yy);
		cstmt.setString(7, dm.mvin_apt_cnt);
		cstmt.setString(8, dm.yy_sub);
		cstmt.setString(9, dm.dong_cd_sub);
		cstmt.setString(10, dm.mode_sub);
		cstmt.setString(11, dm.bo_cd);
		cstmt.setString(12, dm.ratio);
		cstmt.setString(13, dm.incmgpers);
		cstmt.setString(14, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2230_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("dong_cd = " + getDong_cd());
        System.out.println("yy = " + getYy());
        System.out.println("mvin_apt_cnt = " + getMvin_apt_cnt());
        System.out.println("yy_sub = " + getYy_sub());
        System.out.println("dong_cd_sub = " + getDong_cd_sub());
        System.out.println("mode_sub = " + getMode_sub());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("ratio = " + getRatio());
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String dong_cd = req.getParameter("dong_cd");
if( dong_cd == null){
	System.out.println(this.toString+" : dong_cd is null" );
}else{
	System.out.println(this.toString+" : dong_cd is "+dong_cd );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String mvin_apt_cnt = req.getParameter("mvin_apt_cnt");
if( mvin_apt_cnt == null){
	System.out.println(this.toString+" : mvin_apt_cnt is null" );
}else{
	System.out.println(this.toString+" : mvin_apt_cnt is "+mvin_apt_cnt );
}
String yy_sub = req.getParameter("yy_sub");
if( yy_sub == null){
	System.out.println(this.toString+" : yy_sub is null" );
}else{
	System.out.println(this.toString+" : yy_sub is "+yy_sub );
}
String dong_cd_sub = req.getParameter("dong_cd_sub");
if( dong_cd_sub == null){
	System.out.println(this.toString+" : dong_cd_sub is null" );
}else{
	System.out.println(this.toString+" : dong_cd_sub is "+dong_cd_sub );
}
String mode_sub = req.getParameter("mode_sub");
if( mode_sub == null){
	System.out.println(this.toString+" : mode_sub is null" );
}else{
	System.out.println(this.toString+" : mode_sub is "+mode_sub );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String ratio = req.getParameter("ratio");
if( ratio == null){
	System.out.println(this.toString+" : ratio is null" );
}else{
	System.out.println(this.toString+" : ratio is "+ratio );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String dong_cd = Util.checkString(req.getParameter("dong_cd"));
String yy = Util.checkString(req.getParameter("yy"));
String mvin_apt_cnt = Util.checkString(req.getParameter("mvin_apt_cnt"));
String yy_sub = Util.checkString(req.getParameter("yy_sub"));
String dong_cd_sub = Util.checkString(req.getParameter("dong_cd_sub"));
String mode_sub = Util.checkString(req.getParameter("mode_sub"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String ratio = Util.checkString(req.getParameter("ratio"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String dong_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dong_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String mvin_apt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("mvin_apt_cnt")));
String yy_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_sub")));
String dong_cd_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("dong_cd_sub")));
String mode_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_sub")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setDong_cd(dong_cd);
dm.setYy(yy);
dm.setMvin_apt_cnt(mvin_apt_cnt);
dm.setYy_sub(yy_sub);
dm.setDong_cd_sub(dong_cd_sub);
dm.setMode_sub(mode_sub);
dm.setBo_cd(bo_cd);
dm.setRatio(ratio);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 01 18:05:23 KST 2009 */