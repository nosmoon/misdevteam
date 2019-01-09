/***************************************************************************************************
 * 파일명   : PS_U_MIDI_UPRC.java
 * 기능     : 매체단가 관리 - 수정
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
 *  매체단가 관리 - 수정
 */

public class PS_U_MIDI_UPRCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String medicd;
	public String acpnclsf;
	public String acpntype;
	public String natnareaclsf;
	public String cntryys;
	public String aplydt;
	public long sell_amt;
	public long busnalon;
	public long uprc;
	public long extn_cnt;
	public String remk;
	public String incmgpers;

	public PS_U_MIDI_UPRCDM(){}
	public PS_U_MIDI_UPRCDM(String cmpycd, String bocd, String medicd, String acpnclsf, String acpntype, String natnareaclsf, String cntryys, String aplydt, long sell_amt, long busnalon, long uprc, long extn_cnt, String remk, String incmgpers){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.medicd = medicd;
		this.acpnclsf = acpnclsf;
		this.acpntype = acpntype;
		this.natnareaclsf = natnareaclsf;
		this.cntryys = cntryys;
		this.aplydt = aplydt;
		this.sell_amt = sell_amt;
		this.busnalon = busnalon;
		this.uprc = uprc;
		this.extn_cnt = extn_cnt;
		this.remk = remk;
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setSell_amt(long sell_amt){
		this.sell_amt = sell_amt;
	}

	public void setBusnalon(long busnalon){
		this.busnalon = busnalon;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setExtn_cnt(long extn_cnt){
		this.extn_cnt = extn_cnt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
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

	public long getSell_amt(){
		return this.sell_amt;
	}

	public long getBusnalon(){
		return this.busnalon;
	}

	public long getUprc(){
		return this.uprc;
	}

	public long getExtn_cnt(){
		return this.extn_cnt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_MIDI_UPRC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_MIDI_UPRCDM dm = (PS_U_MIDI_UPRCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.acpnclsf);
		cstmt.setString(7, dm.acpntype);
		cstmt.setString(8, dm.natnareaclsf);
		cstmt.setString(9, dm.cntryys);
		cstmt.setString(10, dm.aplydt);
		cstmt.setLong(11, dm.sell_amt);
		cstmt.setLong(12, dm.busnalon);
		cstmt.setLong(13, dm.uprc);
		cstmt.setLong(14, dm.extn_cnt);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_U_MIDI_UPRCDataSet();
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
String sell_amt = req.getParameter("sell_amt");
if( sell_amt == null){
	System.out.println(this.toString+" : sell_amt is null" );
}else{
	System.out.println(this.toString+" : sell_amt is "+sell_amt );
}
String busnalon = req.getParameter("busnalon");
if( busnalon == null){
	System.out.println(this.toString+" : busnalon is null" );
}else{
	System.out.println(this.toString+" : busnalon is "+busnalon );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String extn_cnt = req.getParameter("extn_cnt");
if( extn_cnt == null){
	System.out.println(this.toString+" : extn_cnt is null" );
}else{
	System.out.println(this.toString+" : extn_cnt is "+extn_cnt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String acpnclsf = Util.checkString(req.getParameter("acpnclsf"));
String acpntype = Util.checkString(req.getParameter("acpntype"));
String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
String cntryys = Util.checkString(req.getParameter("cntryys"));
String aplydt = Util.checkString(req.getParameter("aplydt"));
String sell_amt = Util.checkString(req.getParameter("sell_amt"));
String busnalon = Util.checkString(req.getParameter("busnalon"));
String uprc = Util.checkString(req.getParameter("uprc"));
String extn_cnt = Util.checkString(req.getParameter("extn_cnt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String acpnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnclsf")));
String acpntype = Util.Uni2Ksc(Util.checkString(req.getParameter("acpntype")));
String natnareaclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("natnareaclsf")));
String cntryys = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryys")));
String aplydt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplydt")));
String sell_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_amt")));
String busnalon = Util.Uni2Ksc(Util.checkString(req.getParameter("busnalon")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String extn_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_cnt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setAcpnclsf(acpnclsf);
dm.setAcpntype(acpntype);
dm.setNatnareaclsf(natnareaclsf);
dm.setCntryys(cntryys);
dm.setAplydt(aplydt);
dm.setSell_amt(sell_amt);
dm.setBusnalon(busnalon);
dm.setUprc(uprc);
dm.setExtn_cnt(extn_cnt);
dm.setRemk(remk);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 15:56:32 KST 2005 */