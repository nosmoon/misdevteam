/***************************************************************************************************
* 파일명 : SS_U_DAWNRPTDM.java
* 기능 : 정보공유 새벽근무보고
* 작성일자 : 2003-12-26
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


public class SS_U_DAWNRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;
	public String dutybgntm;
	public String dutyendtm;
	public String dutybonm;
	public String mainchk;
	public String dutycont;
	public String etc;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String chgpers;
	public Timestamp chgdt;

	public SS_U_DAWNRPTDM(){}
	public SS_U_DAWNRPTDM(String makedt, String makepersid, String dutybgntm, String dutyendtm, String dutybonm, String mainchk, String dutycont, String etc, String filenm, String filesize, byte[] filecont, String chgpers, Timestamp chgdt){
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.dutybgntm = dutybgntm;
		this.dutyendtm = dutyendtm;
		this.dutybonm = dutybonm;
		this.mainchk = mainchk;
		this.dutycont = dutycont;
		this.etc = etc;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.chgpers = chgpers;
		this.chgdt = chgdt;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setDutybgntm(String dutybgntm){
		this.dutybgntm = dutybgntm;
	}

	public void setDutyendtm(String dutyendtm){
		this.dutyendtm = dutyendtm;
	}

	public void setDutybonm(String dutybonm){
		this.dutybonm = dutybonm;
	}

	public void setMainchk(String mainchk){
		this.mainchk = mainchk;
	}

	public void setDutycont(String dutycont){
		this.dutycont = dutycont;
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

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(Timestamp chgdt){
		this.chgdt = chgdt;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getDutybgntm(){
		return this.dutybgntm;
	}

	public String getDutyendtm(){
		return this.dutyendtm;
	}

	public String getDutybonm(){
		return this.dutybonm;
	}

	public String getMainchk(){
		return this.mainchk;
	}

	public String getDutycont(){
		return this.dutycont;
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

	public String getChgpers(){
		return this.chgpers;
	}

	public Timestamp getChgdt(){
		return this.chgdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_DAWNRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_DAWNRPTDM dm = (SS_U_DAWNRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
		cstmt.setString(5, dm.dutybgntm);
		cstmt.setString(6, dm.dutyendtm);
		cstmt.setString(7, dm.dutybonm);
		cstmt.setString(8, dm.mainchk);
		cstmt.setString(9, dm.dutycont);
		cstmt.setString(10, dm.etc);
		cstmt.setString(11, dm.filenm);
        cstmt.setBytes(13, dm.filecont);
		cstmt.setString(12, dm.filesize);
		cstmt.setString(14, dm.chgpers);
		cstmt.setTimestamp(15, dm.chgdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_DAWNRPTDataSet();
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
String dutybgntm = req.getParameter("dutybgntm");
if( dutybgntm == null){
	System.out.println(this.toString+" : dutybgntm is null" );
}else{
	System.out.println(this.toString+" : dutybgntm is "+dutybgntm );
}
String dutyendtm = req.getParameter("dutyendtm");
if( dutyendtm == null){
	System.out.println(this.toString+" : dutyendtm is null" );
}else{
	System.out.println(this.toString+" : dutyendtm is "+dutyendtm );
}
String dutybonm = req.getParameter("dutybonm");
if( dutybonm == null){
	System.out.println(this.toString+" : dutybonm is null" );
}else{
	System.out.println(this.toString+" : dutybonm is "+dutybonm );
}
String mainchk = req.getParameter("mainchk");
if( mainchk == null){
	System.out.println(this.toString+" : mainchk is null" );
}else{
	System.out.println(this.toString+" : mainchk is "+mainchk );
}
String dutycont = req.getParameter("dutycont");
if( dutycont == null){
	System.out.println(this.toString+" : dutycont is null" );
}else{
	System.out.println(this.toString+" : dutycont is "+dutycont );
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
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
String chgdt = req.getParameter("chgdt");
if( chgdt == null){
	System.out.println(this.toString+" : chgdt is null" );
}else{
	System.out.println(this.toString+" : chgdt is "+chgdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String dutybgntm = Util.checkString(req.getParameter("dutybgntm"));
String dutyendtm = Util.checkString(req.getParameter("dutyendtm"));
String dutybonm = Util.checkString(req.getParameter("dutybonm"));
String mainchk = Util.checkString(req.getParameter("mainchk"));
String dutycont = Util.checkString(req.getParameter("dutycont"));
String etc = Util.checkString(req.getParameter("etc"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String chgdt = Util.checkString(req.getParameter("chgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String dutybgntm = Util.Uni2Ksc(Util.checkString(req.getParameter("dutybgntm")));
String dutyendtm = Util.Uni2Ksc(Util.checkString(req.getParameter("dutyendtm")));
String dutybonm = Util.Uni2Ksc(Util.checkString(req.getParameter("dutybonm")));
String mainchk = Util.Uni2Ksc(Util.checkString(req.getParameter("mainchk")));
String dutycont = Util.Uni2Ksc(Util.checkString(req.getParameter("dutycont")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String chgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setDutybgntm(dutybgntm);
dm.setDutyendtm(dutyendtm);
dm.setDutybonm(dutybonm);
dm.setMainchk(mainchk);
dm.setDutycont(dutycont);
dm.setEtc(etc);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setChgpers(chgpers);
dm.setChgdt(chgdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 26 19:45:57 KST 2003 */