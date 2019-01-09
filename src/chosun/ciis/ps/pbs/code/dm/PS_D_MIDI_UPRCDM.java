/***************************************************************************************************
 * 파일명   : PS_D_MIDI_UPRC.java
 * 기능     : 매체단가 관리 - 삭제
 * 작성일자 : 2005-06-30
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 *  매체단가 관리 - 삭제
 */

public class PS_D_MIDI_UPRCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String incmgpers;
	public String medicd;
	public String acpnclsf;
	public String acpntype;
	public String natnareaclsf;
	public String cntryys;
	public String aplydt;
	public long extn_cnt;

	public PS_D_MIDI_UPRCDM(){}
	public PS_D_MIDI_UPRCDM(String cmpycd, String bocd, String incmgpers, String medicd, String acpnclsf, String acpntype, String natnareaclsf, String cntryys, String aplydt, long extn_cnt){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.medicd = medicd;
		this.acpnclsf = acpnclsf;
		this.acpntype = acpntype;
		this.natnareaclsf = natnareaclsf;
		this.cntryys = cntryys;
		this.aplydt = aplydt;
		this.extn_cnt = extn_cnt;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAcpnclsf(String acpnclsf){
		this.acpnclsf = acpnclsf;
	}

	public void setAcpntype(String acpntype){
		this.acpntype = acpntype;
	}

	public void setNatnareaclsf(String natnareaclsf){
		this.natnareaclsf = natnareaclsf;
	}

	public void setCntryys(String cntryys){
		this.cntryys = cntryys;
	}

	public void setAplydt(String aplydt){
		this.aplydt = aplydt;
	}

	public void setExtn_cnt(long extn_cnt){
		this.extn_cnt = extn_cnt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAcpnclsf(){
		return this.acpnclsf;
	}

	public String getAcpntype(){
		return this.acpntype;
	}

	public String getNatnareaclsf(){
		return this.natnareaclsf;
	}

	public String getCntryys(){
		return this.cntryys;
	}

	public String getAplydt(){
		return this.aplydt;
	}

	public long getExtn_cnt(){
		return this.extn_cnt;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_MIDI_UPRC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_MIDI_UPRCDM dm = (PS_D_MIDI_UPRCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.acpnclsf);
		cstmt.setString(8, dm.acpntype);
		cstmt.setString(9, dm.natnareaclsf);
		cstmt.setString(10, dm.cntryys);
		cstmt.setString(11, dm.aplydt);
		cstmt.setLong(12, dm.extn_cnt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_D_MIDI_UPRCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String acpnclsf = req.getParameter("acpnclsf");
if( acpnclsf == null){
	System.out.println(this.toString+" : acpnclsf is null" );
}else{
	System.out.println(this.toString+" : acpnclsf is "+acpnclsf );
}
String acpntype = req.getParameter("acpntype");
if( acpntype == null){
	System.out.println(this.toString+" : acpntype is null" );
}else{
	System.out.println(this.toString+" : acpntype is "+acpntype );
}
String natnareaclsf = req.getParameter("natnareaclsf");
if( natnareaclsf == null){
	System.out.println(this.toString+" : natnareaclsf is null" );
}else{
	System.out.println(this.toString+" : natnareaclsf is "+natnareaclsf );
}
String cntryys = req.getParameter("cntryys");
if( cntryys == null){
	System.out.println(this.toString+" : cntryys is null" );
}else{
	System.out.println(this.toString+" : cntryys is "+cntryys );
}
String aplydt = req.getParameter("aplydt");
if( aplydt == null){
	System.out.println(this.toString+" : aplydt is null" );
}else{
	System.out.println(this.toString+" : aplydt is "+aplydt );
}
String extn_cnt = req.getParameter("extn_cnt");
if( extn_cnt == null){
	System.out.println(this.toString+" : extn_cnt is null" );
}else{
	System.out.println(this.toString+" : extn_cnt is "+extn_cnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String medicd = Util.checkString(req.getParameter("medicd"));
String acpnclsf = Util.checkString(req.getParameter("acpnclsf"));
String acpntype = Util.checkString(req.getParameter("acpntype"));
String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
String cntryys = Util.checkString(req.getParameter("cntryys"));
String aplydt = Util.checkString(req.getParameter("aplydt"));
String extn_cnt = Util.checkString(req.getParameter("extn_cnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String acpnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnclsf")));
String acpntype = Util.Uni2Ksc(Util.checkString(req.getParameter("acpntype")));
String natnareaclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("natnareaclsf")));
String cntryys = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryys")));
String aplydt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplydt")));
String extn_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_cnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setMedicd(medicd);
dm.setAcpnclsf(acpnclsf);
dm.setAcpntype(acpntype);
dm.setNatnareaclsf(natnareaclsf);
dm.setCntryys(cntryys);
dm.setAplydt(aplydt);
dm.setExtn_cnt(extn_cnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 15:57:32 KST 2005 */