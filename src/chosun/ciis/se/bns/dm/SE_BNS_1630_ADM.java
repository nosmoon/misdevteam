/***************************************************************************************************
* 파일명 : SE_BNS_1630_ADM.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-04-30
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1630_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String mode				;
	public String bns_item_cd		;
	public String divn_dt			;
	public String bo_cd				;
	public String bo_seq			;
	public String ewh_seq			;
	public String area_cd			;
	public String qunt				;
	public String uprc				;
	public String divn_uprc			;
	public String compen_divn_amt	;
	public String nocompen_divn_amt	;
	public String incmg_pers		;
	public String incmg_pers_ip		;

	public SE_BNS_1630_ADM(){}
	public SE_BNS_1630_ADM(String cmpy_cd, String mode, String bns_item_cd, String divn_dt, String bo_cd, String bo_seq, String ewh_seq, String area_cd, String qunt, String uprc, String divn_uprc, String compen_divn_amt, String nocompen_divn_amt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd 			= cmpy_cd			;
		this.mode 				= mode				;
		this.bns_item_cd 		= bns_item_cd		;
		this.divn_dt 			= divn_dt			;
		this.bo_cd 				= bo_cd				;
		this.bo_seq 			= bo_seq			;
		this.ewh_seq 			= ewh_seq			;
		this.area_cd 			= area_cd			;
		this.qunt 				= qunt				;
		this.uprc 				= uprc				;
		this.divn_uprc 			= divn_uprc			;
		this.compen_divn_amt 	= compen_divn_amt	;
		this.nocompen_divn_amt 	= nocompen_divn_amt	;
		this.incmg_pers 		= incmg_pers		;
		this.incmg_pers_ip 		= incmg_pers_ip		;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setCompen_divn_amt(String compen_divn_amt){
		this.compen_divn_amt = compen_divn_amt;
	}

	public void setNocompen_divn_amt(String nocompen_divn_amt){
		this.nocompen_divn_amt = nocompen_divn_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getCompen_divn_amt(){
		return this.compen_divn_amt;
	}

	public String getNocompen_divn_amt(){
		return this.nocompen_divn_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1630_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1630_ADM dm = (SE_BNS_1630_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd			);
		cstmt.setString( 4, dm.mode				);
		cstmt.setString( 5, dm.bns_item_cd		);
		cstmt.setString( 6, dm.divn_dt			);
		cstmt.setString( 7, dm.bo_cd			);
		cstmt.setString( 8, dm.bo_seq			);
		cstmt.setString( 9, dm.ewh_seq			);
		cstmt.setString(10, dm.area_cd			);
		cstmt.setString(11, dm.qunt				);
		cstmt.setString(12, dm.uprc				);
		cstmt.setString(13, dm.divn_uprc		);
		cstmt.setString(14, dm.compen_divn_amt	);
		cstmt.setString(15, dm.nocompen_divn_amt);
		cstmt.setString(16, dm.incmg_pers		);
		cstmt.setString(17, dm.incmg_pers_ip	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1630_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 			= " + getCmpy_cd			());
        System.out.println("mode 				= " + getMode				());
        System.out.println("bns_item_cd 		= " + getBns_item_cd		());
        System.out.println("divn_dt 			= " + getDivn_dt			());
        System.out.println("bo_cd 				= " + getBo_cd				());
        System.out.println("bo_seq 				= " + getBo_seq				());
        System.out.println("ewh_seq 			= " + getEwh_seq			());
        System.out.println("area_cd 			= " + getArea_cd			());
        System.out.println("qunt 				= " + getQunt				());
        System.out.println("uprc 				= " + getUprc				());
        System.out.println("divn_uprc 			= " + getDivn_uprc			());
        System.out.println("compen_divn_amt 	= " + getCompen_divn_amt	());
        System.out.println("nocompen_divn_amt 	= " + getNocompen_divn_amt	());
        System.out.println("incmg_pers 			= " + getIncmg_pers			());
        System.out.println("incmg_pers_ip 		= " + getIncmg_pers_ip		());
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
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String divn_dt = req.getParameter("divn_dt");
if( divn_dt == null){
	System.out.println(this.toString+" : divn_dt is null" );
}else{
	System.out.println(this.toString+" : divn_dt is "+divn_dt );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String ewh_seq = req.getParameter("ewh_seq");
if( ewh_seq == null){
	System.out.println(this.toString+" : ewh_seq is null" );
}else{
	System.out.println(this.toString+" : ewh_seq is "+ewh_seq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String divn_uprc = req.getParameter("divn_uprc");
if( divn_uprc == null){
	System.out.println(this.toString+" : divn_uprc is null" );
}else{
	System.out.println(this.toString+" : divn_uprc is "+divn_uprc );
}
String compen_divn_amt = req.getParameter("compen_divn_amt");
if( compen_divn_amt == null){
	System.out.println(this.toString+" : compen_divn_amt is null" );
}else{
	System.out.println(this.toString+" : compen_divn_amt is "+compen_divn_amt );
}
String nocompen_divn_amt = req.getParameter("nocompen_divn_amt");
if( nocompen_divn_amt == null){
	System.out.println(this.toString+" : nocompen_divn_amt is null" );
}else{
	System.out.println(this.toString+" : nocompen_divn_amt is "+nocompen_divn_amt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String divn_dt = Util.checkString(req.getParameter("divn_dt"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String ewh_seq = Util.checkString(req.getParameter("ewh_seq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String divn_uprc = Util.checkString(req.getParameter("divn_uprc"));
String compen_divn_amt = Util.checkString(req.getParameter("compen_divn_amt"));
String nocompen_divn_amt = Util.checkString(req.getParameter("nocompen_divn_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String divn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String ewh_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String divn_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_uprc")));
String compen_divn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("compen_divn_amt")));
String nocompen_divn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("nocompen_divn_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBns_item_cd(bns_item_cd);
dm.setDivn_dt(divn_dt);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setEwh_seq(ewh_seq);
dm.setArea_cd(area_cd);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setDivn_uprc(divn_uprc);
dm.setCompen_divn_amt(compen_divn_amt);
dm.setNocompen_divn_amt(nocompen_divn_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:22:15 KST 2009 */