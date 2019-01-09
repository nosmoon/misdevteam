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


package chosun.ciis.ad.com.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_COM_1430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cnfm_dt;
	public String seq;
	public String pubc_side;
	public String advcs;
	public String std;
	public String slcrg;
	public String cnfm_matt;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String flag;

	public AD_COM_1430_ADM(){}
	public AD_COM_1430_ADM(String cmpy_cd, String cnfm_dt, String seq, String pubc_side, String advcs, String std, String slcrg, String cnfm_matt, String incmg_pers, String incmg_pers_ip, String flag){
		this.cmpy_cd = cmpy_cd;
		this.cnfm_dt = cnfm_dt;
		this.seq = seq;
		this.pubc_side = pubc_side;
		this.advcs = advcs;
		this.std = std;
		this.slcrg = slcrg;
		this.cnfm_matt = cnfm_matt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCnfm_dt(String cnfm_dt){
		this.cnfm_dt = cnfm_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setAdvcs(String advcs){
		this.advcs = advcs;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setSlcrg(String slcrg){
		this.slcrg = slcrg;
	}

	public void setCnfm_matt(String cnfm_matt){
		this.cnfm_matt = cnfm_matt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCnfm_dt(){
		return this.cnfm_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getAdvcs(){
		return this.advcs;
	}

	public String getStd(){
		return this.std;
	}

	public String getSlcrg(){
		return this.slcrg;
	}

	public String getCnfm_matt(){
		return this.cnfm_matt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_COM_1430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_COM_1430_ADM dm = (AD_COM_1430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cnfm_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.pubc_side);
		cstmt.setString(7, dm.advcs);
		cstmt.setString(8, dm.std);
		cstmt.setString(9, dm.slcrg);
		cstmt.setString(10, dm.cnfm_matt);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.com.ds.AD_COM_1430_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cnfm_dt = [" + getCnfm_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("advcs = [" + getAdvcs() + "]");
		System.out.println("std = [" + getStd() + "]");
		System.out.println("slcrg = [" + getSlcrg() + "]");
		System.out.println("cnfm_matt = [" + getCnfm_matt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String cnfm_dt = req.getParameter("cnfm_dt");
if( cnfm_dt == null){
	System.out.println(this.toString+" : cnfm_dt is null" );
}else{
	System.out.println(this.toString+" : cnfm_dt is "+cnfm_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String advcs = req.getParameter("advcs");
if( advcs == null){
	System.out.println(this.toString+" : advcs is null" );
}else{
	System.out.println(this.toString+" : advcs is "+advcs );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
}
String slcrg = req.getParameter("slcrg");
if( slcrg == null){
	System.out.println(this.toString+" : slcrg is null" );
}else{
	System.out.println(this.toString+" : slcrg is "+slcrg );
}
String cnfm_matt = req.getParameter("cnfm_matt");
if( cnfm_matt == null){
	System.out.println(this.toString+" : cnfm_matt is null" );
}else{
	System.out.println(this.toString+" : cnfm_matt is "+cnfm_matt );
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
String cnfm_dt = Util.checkString(req.getParameter("cnfm_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String advcs = Util.checkString(req.getParameter("advcs"));
String std = Util.checkString(req.getParameter("std"));
String slcrg = Util.checkString(req.getParameter("slcrg"));
String cnfm_matt = Util.checkString(req.getParameter("cnfm_matt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cnfm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String advcs = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String slcrg = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg")));
String cnfm_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_matt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCnfm_dt(cnfm_dt);
dm.setSeq(seq);
dm.setPubc_side(pubc_side);
dm.setAdvcs(advcs);
dm.setStd(std);
dm.setSlcrg(slcrg);
dm.setCnfm_matt(cnfm_matt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 19 20:37:27 KST 2009 */