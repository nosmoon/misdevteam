/***************************************************************************************************
* 파일명 : .java
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


public class SE_BOI_2260_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String sido;
	public String gugun;
	public String dong;
	public String remk;
	public String apt_cnt;
	public String mvin_apt_cnt;
	public String hous_cnt;
	public String shop_cnt;
	public String offi_room_cnt;
	public String popl_cnt;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BOI_2260_ADM(){}
	public SE_BOI_2260_ADM(String cmpy_cd, String yy, String sido, String gugun, String dong, String remk, String apt_cnt, String mvin_apt_cnt, String hous_cnt, String shop_cnt, String offi_room_cnt, String popl_cnt, String incmgpers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.remk = remk;
		this.apt_cnt = apt_cnt;
		this.mvin_apt_cnt = mvin_apt_cnt;
		this.hous_cnt = hous_cnt;
		this.shop_cnt = shop_cnt;
		this.offi_room_cnt = offi_room_cnt;
		this.popl_cnt = popl_cnt;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setApt_cnt(String apt_cnt){
		this.apt_cnt = apt_cnt;
	}

	public void setMvin_apt_cnt(String mvin_apt_cnt){
		this.mvin_apt_cnt = mvin_apt_cnt;
	}

	public void setHous_cnt(String hous_cnt){
		this.hous_cnt = hous_cnt;
	}

	public void setShop_cnt(String shop_cnt){
		this.shop_cnt = shop_cnt;
	}

	public void setOffi_room_cnt(String offi_room_cnt){
		this.offi_room_cnt = offi_room_cnt;
	}

	public void setPopl_cnt(String popl_cnt){
		this.popl_cnt = popl_cnt;
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

	public String getYy(){
		return this.yy;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getDong(){
		return this.dong;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getApt_cnt(){
		return this.apt_cnt;
	}

	public String getMvin_apt_cnt(){
		return this.mvin_apt_cnt;
	}

	public String getHous_cnt(){
		return this.hous_cnt;
	}

	public String getShop_cnt(){
		return this.shop_cnt;
	}

	public String getOffi_room_cnt(){
		return this.offi_room_cnt;
	}

	public String getPopl_cnt(){
		return this.popl_cnt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_2260_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2260_ADM dm = (SE_BOI_2260_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.sido);
		cstmt.setString(6, dm.gugun);
		cstmt.setString(7, dm.dong);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.apt_cnt);
		cstmt.setString(10, dm.mvin_apt_cnt);
		cstmt.setString(11, dm.hous_cnt);
		cstmt.setString(12, dm.shop_cnt);
		cstmt.setString(13, dm.offi_room_cnt);
		cstmt.setString(14, dm.popl_cnt);
		cstmt.setString(15, dm.incmgpers);
		cstmt.setString(16, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2260_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yy = " + getYy());
        System.out.println("sido = " + getSido());
        System.out.println("gugun = " + getGugun());
        System.out.println("dong = " + getDong());
        System.out.println("remk = " + getRemk());
        System.out.println("apt_cnt = " + getApt_cnt());
        System.out.println("mvin_apt_cnt = " + getMvin_apt_cnt());
        System.out.println("hous_cnt = " + getHous_cnt());
        System.out.println("shop_cnt = " + getShop_cnt());
        System.out.println("offi_room_cnt = " + getOffi_room_cnt());
        System.out.println("popl_cnt = " + getPopl_cnt());
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gugun = req.getParameter("gugun");
if( gugun == null){
	System.out.println(this.toString+" : gugun is null" );
}else{
	System.out.println(this.toString+" : gugun is "+gugun );
}
String dong = req.getParameter("dong");
if( dong == null){
	System.out.println(this.toString+" : dong is null" );
}else{
	System.out.println(this.toString+" : dong is "+dong );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String apt_cnt = req.getParameter("apt_cnt");
if( apt_cnt == null){
	System.out.println(this.toString+" : apt_cnt is null" );
}else{
	System.out.println(this.toString+" : apt_cnt is "+apt_cnt );
}
String mvin_apt_cnt = req.getParameter("mvin_apt_cnt");
if( mvin_apt_cnt == null){
	System.out.println(this.toString+" : mvin_apt_cnt is null" );
}else{
	System.out.println(this.toString+" : mvin_apt_cnt is "+mvin_apt_cnt );
}
String hous_cnt = req.getParameter("hous_cnt");
if( hous_cnt == null){
	System.out.println(this.toString+" : hous_cnt is null" );
}else{
	System.out.println(this.toString+" : hous_cnt is "+hous_cnt );
}
String shop_cnt = req.getParameter("shop_cnt");
if( shop_cnt == null){
	System.out.println(this.toString+" : shop_cnt is null" );
}else{
	System.out.println(this.toString+" : shop_cnt is "+shop_cnt );
}
String offi_room_cnt = req.getParameter("offi_room_cnt");
if( offi_room_cnt == null){
	System.out.println(this.toString+" : offi_room_cnt is null" );
}else{
	System.out.println(this.toString+" : offi_room_cnt is "+offi_room_cnt );
}
String popl_cnt = req.getParameter("popl_cnt");
if( popl_cnt == null){
	System.out.println(this.toString+" : popl_cnt is null" );
}else{
	System.out.println(this.toString+" : popl_cnt is "+popl_cnt );
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
String yy = Util.checkString(req.getParameter("yy"));
String sido = Util.checkString(req.getParameter("sido"));
String gugun = Util.checkString(req.getParameter("gugun"));
String dong = Util.checkString(req.getParameter("dong"));
String remk = Util.checkString(req.getParameter("remk"));
String apt_cnt = Util.checkString(req.getParameter("apt_cnt"));
String mvin_apt_cnt = Util.checkString(req.getParameter("mvin_apt_cnt"));
String hous_cnt = Util.checkString(req.getParameter("hous_cnt"));
String shop_cnt = Util.checkString(req.getParameter("shop_cnt"));
String offi_room_cnt = Util.checkString(req.getParameter("offi_room_cnt"));
String popl_cnt = Util.checkString(req.getParameter("popl_cnt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun")));
String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String apt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("apt_cnt")));
String mvin_apt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("mvin_apt_cnt")));
String hous_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_cnt")));
String shop_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("shop_cnt")));
String offi_room_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_room_cnt")));
String popl_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("popl_cnt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setSido(sido);
dm.setGugun(gugun);
dm.setDong(dong);
dm.setRemk(remk);
dm.setApt_cnt(apt_cnt);
dm.setMvin_apt_cnt(mvin_apt_cnt);
dm.setHous_cnt(hous_cnt);
dm.setShop_cnt(shop_cnt);
dm.setOffi_room_cnt(offi_room_cnt);
dm.setPopl_cnt(popl_cnt);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 11:43:01 KST 2009 */