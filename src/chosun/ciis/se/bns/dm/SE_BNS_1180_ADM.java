/***************************************************************************************************
* 파일명 : SE_BNS_1180_ADM.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
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


public class SE_BNS_1180_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String bns_item_cd;
	public String dscn_seq;
	public String qunt;
	public String dscn_uprc;
	public String remk;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BNS_1180_ADM(){}
	public SE_BNS_1180_ADM(String cmpy_cd, String mode, String bns_item_cd, String dscn_seq, String qunt, String dscn_uprc, String remk, String incmgpers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.bns_item_cd = bns_item_cd;
		this.dscn_seq = dscn_seq;
		this.qunt = qunt;
		this.dscn_uprc = dscn_uprc;
		this.remk = remk;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
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

	public void setDscn_seq(String dscn_seq){
		this.dscn_seq = dscn_seq;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setDscn_uprc(String dscn_uprc){
		this.dscn_uprc = dscn_uprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getDscn_seq(){
		return this.dscn_seq;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getDscn_uprc(){
		return this.dscn_uprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1180_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1180_ADM dm = (SE_BNS_1180_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.bns_item_cd);
		cstmt.setString(6, dm.dscn_seq);
		cstmt.setString(7, dm.qunt);
		cstmt.setString(8, dm.dscn_uprc);
		cstmt.setString(9, dm.remk);
		cstmt.setString(10, dm.incmgpers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1180_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("bns_item_cd = " + getBns_item_cd());
        System.out.println("dscn_seq = " + getDscn_seq());
        System.out.println("qunt = " + getQunt());
        System.out.println("dscn_uprc = " + getDscn_uprc());
        System.out.println("remk = " + getRemk());
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
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String dscn_seq = req.getParameter("dscn_seq");
if( dscn_seq == null){
	System.out.println(this.toString+" : dscn_seq is null" );
}else{
	System.out.println(this.toString+" : dscn_seq is "+dscn_seq );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String dscn_uprc = req.getParameter("dscn_uprc");
if( dscn_uprc == null){
	System.out.println(this.toString+" : dscn_uprc is null" );
}else{
	System.out.println(this.toString+" : dscn_uprc is "+dscn_uprc );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String dscn_seq = Util.checkString(req.getParameter("dscn_seq"));
String qunt = Util.checkString(req.getParameter("qunt"));
String dscn_uprc = Util.checkString(req.getParameter("dscn_uprc"));
String remk = Util.checkString(req.getParameter("remk"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String dscn_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dscn_seq")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String dscn_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("dscn_uprc")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBns_item_cd(bns_item_cd);
dm.setDscn_seq(dscn_seq);
dm.setQunt(qunt);
dm.setDscn_uprc(dscn_uprc);
dm.setRemk(remk);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 18:44:20 KST 2009 */