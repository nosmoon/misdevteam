/***************************************************************************************************
* 파일명 : SE_BAS_1220_ADM.java
* 기능 : 기준정보관리 - 매체단가관리
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String aply_yymm;
	public String medi_cd;
	public String sell_net_clsf;
	public String uprc_amt;
	public String uprc_aply_clsf;
	public String remk;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_BAS_1220_ADM(){}
	public SE_BAS_1220_ADM(String cmpy_cd, String mode, String aply_yymm, String medi_cd, String sell_net_clsf, String uprc_amt, String uprc_aply_clsf, String remk, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.aply_yymm = aply_yymm;
		this.medi_cd = medi_cd;
		this.sell_net_clsf = sell_net_clsf;
		this.uprc_amt = uprc_amt;
		this.uprc_aply_clsf = uprc_aply_clsf;
		this.remk = remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setUprc_amt(String uprc_amt){
		this.uprc_amt = uprc_amt;
	}

	public void setUprc_aply_clsf(String uprc_aply_clsf){
		this.uprc_aply_clsf = uprc_aply_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
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

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getUprc_amt(){
		return this.uprc_amt;
	}

	public String getUprc_aply_clsf(){
		return this.uprc_aply_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_BAS_1220_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1220_ADM dm = (SE_BAS_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.aply_yymm);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.sell_net_clsf);
		cstmt.setString(8, dm.uprc_amt);
		cstmt.setString(9, dm.uprc_aply_clsf);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1220_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("aply_yymm = " + getAply_yymm());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("sell_net_clsf = " + getSell_net_clsf());
        System.out.println("uprc_amt = " + getUprc_amt());
        System.out.println("uprc_aply_clsf = " + getUprc_aply_clsf());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sell_net_clsf = req.getParameter("sell_net_clsf");
if( sell_net_clsf == null){
	System.out.println(this.toString+" : sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : sell_net_clsf is "+sell_net_clsf );
}
String uprc_amt = req.getParameter("uprc_amt");
if( uprc_amt == null){
	System.out.println(this.toString+" : uprc_amt is null" );
}else{
	System.out.println(this.toString+" : uprc_amt is "+uprc_amt );
}
String uprc_aply_clsf = req.getParameter("uprc_aply_clsf");
if( uprc_aply_clsf == null){
	System.out.println(this.toString+" : uprc_aply_clsf is null" );
}else{
	System.out.println(this.toString+" : uprc_aply_clsf is "+uprc_aply_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));
String uprc_amt = Util.checkString(req.getParameter("uprc_amt"));
String uprc_aply_clsf = Util.checkString(req.getParameter("uprc_aply_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_net_clsf")));
String uprc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_amt")));
String uprc_aply_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_aply_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAply_yymm(aply_yymm);
dm.setMedi_cd(medi_cd);
dm.setSell_net_clsf(sell_net_clsf);
dm.setUprc_amt(uprc_amt);
dm.setUprc_aply_clsf(uprc_aply_clsf);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */