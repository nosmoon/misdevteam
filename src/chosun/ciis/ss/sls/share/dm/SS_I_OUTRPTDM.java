/***************************************************************************************************
* 파일명 : SS_I_OUTRPTDM.java
* 기능 : 정보공유 출장보고서 등록
* 작성일자 : 2003-12-24
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_I_OUTRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;
	public String makepersnm;
	public String deptcd;
	public String deptnm;
	public String outplacfrdt;
	public String outplactodt;
	public String outplacarea;
	public String reptcont;
	public String etc;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String incmgpers;
	public Timestamp incmgdt;

	public SS_I_OUTRPTDM(){}
	public SS_I_OUTRPTDM(String makedt, String makepersid, String makepersnm, String deptcd, String deptnm, String outplacfrdt, String outplactodt, String outplacarea, String reptcont, String etc, String filenm, String filesize, byte[] filecont, String incmgpers, Timestamp incmgdt){
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.outplacfrdt = outplacfrdt;
		this.outplactodt = outplactodt;
		this.outplacarea = outplacarea;
		this.reptcont = reptcont;
		this.etc = etc;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.incmgpers = incmgpers;
		this.incmgdt = incmgdt;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setOutplacfrdt(String outplacfrdt){
		this.outplacfrdt = outplacfrdt;
	}

	public void setOutplactodt(String outplactodt){
		this.outplactodt = outplactodt;
	}

	public void setOutplacarea(String outplacarea){
		this.outplacarea = outplacarea;
	}

	public void setReptcont(String reptcont){
		this.reptcont = reptcont;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public void setFilecont(byte[] filecont){
		this.filecont = filecont;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(Timestamp incmgdt){
		this.incmgdt = incmgdt;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getOutplacfrdt(){
		return this.outplacfrdt;
	}

	public String getOutplactodt(){
		return this.outplactodt;
	}

	public String getOutplacarea(){
		return this.outplacarea;
	}

	public String getReptcont(){
		return this.reptcont;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}

	public byte[] getFilecont(){
		return this.filecont;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public Timestamp getIncmgdt(){
		return this.incmgdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_OUTRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_OUTRPTDM dm = (SS_I_OUTRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
		cstmt.setString(5, dm.makepersnm);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.deptnm);
		cstmt.setString(8, dm.outplacfrdt);
		cstmt.setString(9, dm.outplactodt);
		cstmt.setString(10, dm.outplacarea);
		cstmt.setString(11, dm.reptcont);
		cstmt.setString(12, dm.etc);
		cstmt.setString(13, dm.filenm);
		cstmt.setString(14, dm.filesize);
        cstmt.setBytes(15,dm.filecont);
		cstmt.setString(16, dm.incmgpers);
		cstmt.setTimestamp(17, dm.incmgdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_I_OUTRPTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
}
String makepersnm = req.getParameter("makepersnm");
if( makepersnm == null){
	System.out.println(this.toString+" : makepersnm is null" );
}else{
	System.out.println(this.toString+" : makepersnm is "+makepersnm );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
	System.out.println(this.toString+" : deptnm is null" );
}else{
	System.out.println(this.toString+" : deptnm is "+deptnm );
}
String outplacfrdt = req.getParameter("outplacfrdt");
if( outplacfrdt == null){
	System.out.println(this.toString+" : outplacfrdt is null" );
}else{
	System.out.println(this.toString+" : outplacfrdt is "+outplacfrdt );
}
String outplactodt = req.getParameter("outplactodt");
if( outplactodt == null){
	System.out.println(this.toString+" : outplactodt is null" );
}else{
	System.out.println(this.toString+" : outplactodt is "+outplactodt );
}
String outplacarea = req.getParameter("outplacarea");
if( outplacarea == null){
	System.out.println(this.toString+" : outplacarea is null" );
}else{
	System.out.println(this.toString+" : outplacarea is "+outplacarea );
}
String reptcont = req.getParameter("reptcont");
if( reptcont == null){
	System.out.println(this.toString+" : reptcont is null" );
}else{
	System.out.println(this.toString+" : reptcont is "+reptcont );
}
String etc = req.getParameter("etc");
if( etc == null){
	System.out.println(this.toString+" : etc is null" );
}else{
	System.out.println(this.toString+" : etc is "+etc );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String filesize = req.getParameter("filesize");
if( filesize == null){
	System.out.println(this.toString+" : filesize is null" );
}else{
	System.out.println(this.toString+" : filesize is "+filesize );
}
String filecont = req.getParameter("filecont");
if( filecont == null){
	System.out.println(this.toString+" : filecont is null" );
}else{
	System.out.println(this.toString+" : filecont is "+filecont );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
	System.out.println(this.toString+" : incmgdt is null" );
}else{
	System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String outplacfrdt = Util.checkString(req.getParameter("outplacfrdt"));
String outplactodt = Util.checkString(req.getParameter("outplactodt"));
String outplacarea = Util.checkString(req.getParameter("outplacarea"));
String reptcont = Util.checkString(req.getParameter("reptcont"));
String etc = Util.checkString(req.getParameter("etc"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String deptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm")));
String outplacfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("outplacfrdt")));
String outplactodt = Util.Uni2Ksc(Util.checkString(req.getParameter("outplactodt")));
String outplacarea = Util.Uni2Ksc(Util.checkString(req.getParameter("outplacarea")));
String reptcont = Util.Uni2Ksc(Util.checkString(req.getParameter("reptcont")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setMakepersnm(makepersnm);
dm.setDeptcd(deptcd);
dm.setDeptnm(deptnm);
dm.setOutplacfrdt(outplacfrdt);
dm.setOutplactodt(outplactodt);
dm.setOutplacarea(outplacarea);
dm.setReptcont(reptcont);
dm.setEtc(etc);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setIncmgpers(incmgpers);
dm.setIncmgdt(incmgdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 24 15:14:56 KST 2003 */