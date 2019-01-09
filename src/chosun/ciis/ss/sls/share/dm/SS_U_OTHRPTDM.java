/***************************************************************************************************
* 파일명 : SS_U_OTHRPTDM.java
* 기능 : 정보공유 타사동향보고
* 작성일자 : 2003-12-29
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


public class SS_U_OTHRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public String makedt;
	public String jungpoly;
	public String jungmovmt;
	public String jungetc;
	public String dongpoly;
	public String dongmovmt;
	public String dongetc;
	public String etcpoly;
	public String etcmovmt;
	public String etcetc;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String chgpers;
	public Timestamp chgdt;

	public SS_U_OTHRPTDM(){}
	public SS_U_OTHRPTDM(long seq, String makedt, String jungpoly, String jungmovmt, String jungetc, String dongpoly, String dongmovmt, String dongetc, String etcpoly, String etcmovmt, String etcetc, String filenm, String filesize, byte[] filecont, String chgpers, Timestamp chgdt){
		this.seq = seq;
		this.makedt = makedt;
		this.jungpoly = jungpoly;
		this.jungmovmt = jungmovmt;
		this.jungetc = jungetc;
		this.dongpoly = dongpoly;
		this.dongmovmt = dongmovmt;
		this.dongetc = dongetc;
		this.etcpoly = etcpoly;
		this.etcmovmt = etcmovmt;
		this.etcetc = etcetc;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.chgpers = chgpers;
		this.chgdt = chgdt;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setJungpoly(String jungpoly){
		this.jungpoly = jungpoly;
	}

	public void setJungmovmt(String jungmovmt){
		this.jungmovmt = jungmovmt;
	}

	public void setJungetc(String jungetc){
		this.jungetc = jungetc;
	}

	public void setDongpoly(String dongpoly){
		this.dongpoly = dongpoly;
	}

	public void setDongmovmt(String dongmovmt){
		this.dongmovmt = dongmovmt;
	}

	public void setDongetc(String dongetc){
		this.dongetc = dongetc;
	}

	public void setEtcpoly(String etcpoly){
		this.etcpoly = etcpoly;
	}

	public void setEtcmovmt(String etcmovmt){
		this.etcmovmt = etcmovmt;
	}

	public void setEtcetc(String etcetc){
		this.etcetc = etcetc;
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

	public long getSeq(){
		return this.seq;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getJungpoly(){
		return this.jungpoly;
	}

	public String getJungmovmt(){
		return this.jungmovmt;
	}

	public String getJungetc(){
		return this.jungetc;
	}

	public String getDongpoly(){
		return this.dongpoly;
	}

	public String getDongmovmt(){
		return this.dongmovmt;
	}

	public String getDongetc(){
		return this.dongetc;
	}

	public String getEtcpoly(){
		return this.etcpoly;
	}

	public String getEtcmovmt(){
		return this.etcmovmt;
	}

	public String getEtcetc(){
		return this.etcetc;
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
		 return "{ call SP_SS_U_OTHRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_OTHRPTDM dm = (SS_U_OTHRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setString(4, dm.makedt);
		cstmt.setString(5, dm.jungpoly);
		cstmt.setString(6, dm.jungmovmt);
		cstmt.setString(7, dm.jungetc);
		cstmt.setString(8, dm.dongpoly);
		cstmt.setString(9, dm.dongmovmt);
		cstmt.setString(10, dm.dongetc);
		cstmt.setString(11, dm.etcpoly);
		cstmt.setString(12, dm.etcmovmt);
		cstmt.setString(13, dm.etcetc);
		cstmt.setString(14, dm.filenm);
		cstmt.setString(15, dm.filesize);
        cstmt.setBytes(16, dm.filecont);
		cstmt.setString(17, dm.chgpers);
		cstmt.setTimestamp(18, dm.chgdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_OTHRPTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String jungpoly = req.getParameter("jungpoly");
if( jungpoly == null){
	System.out.println(this.toString+" : jungpoly is null" );
}else{
	System.out.println(this.toString+" : jungpoly is "+jungpoly );
}
String jungmovmt = req.getParameter("jungmovmt");
if( jungmovmt == null){
	System.out.println(this.toString+" : jungmovmt is null" );
}else{
	System.out.println(this.toString+" : jungmovmt is "+jungmovmt );
}
String jungetc = req.getParameter("jungetc");
if( jungetc == null){
	System.out.println(this.toString+" : jungetc is null" );
}else{
	System.out.println(this.toString+" : jungetc is "+jungetc );
}
String dongpoly = req.getParameter("dongpoly");
if( dongpoly == null){
	System.out.println(this.toString+" : dongpoly is null" );
}else{
	System.out.println(this.toString+" : dongpoly is "+dongpoly );
}
String dongmovmt = req.getParameter("dongmovmt");
if( dongmovmt == null){
	System.out.println(this.toString+" : dongmovmt is null" );
}else{
	System.out.println(this.toString+" : dongmovmt is "+dongmovmt );
}
String dongetc = req.getParameter("dongetc");
if( dongetc == null){
	System.out.println(this.toString+" : dongetc is null" );
}else{
	System.out.println(this.toString+" : dongetc is "+dongetc );
}
String etcpoly = req.getParameter("etcpoly");
if( etcpoly == null){
	System.out.println(this.toString+" : etcpoly is null" );
}else{
	System.out.println(this.toString+" : etcpoly is "+etcpoly );
}
String etcmovmt = req.getParameter("etcmovmt");
if( etcmovmt == null){
	System.out.println(this.toString+" : etcmovmt is null" );
}else{
	System.out.println(this.toString+" : etcmovmt is "+etcmovmt );
}
String etcetc = req.getParameter("etcetc");
if( etcetc == null){
	System.out.println(this.toString+" : etcetc is null" );
}else{
	System.out.println(this.toString+" : etcetc is "+etcetc );
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

String seq = Util.checkString(req.getParameter("seq"));
String makedt = Util.checkString(req.getParameter("makedt"));
String jungpoly = Util.checkString(req.getParameter("jungpoly"));
String jungmovmt = Util.checkString(req.getParameter("jungmovmt"));
String jungetc = Util.checkString(req.getParameter("jungetc"));
String dongpoly = Util.checkString(req.getParameter("dongpoly"));
String dongmovmt = Util.checkString(req.getParameter("dongmovmt"));
String dongetc = Util.checkString(req.getParameter("dongetc"));
String etcpoly = Util.checkString(req.getParameter("etcpoly"));
String etcmovmt = Util.checkString(req.getParameter("etcmovmt"));
String etcetc = Util.checkString(req.getParameter("etcetc"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String chgdt = Util.checkString(req.getParameter("chgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String jungpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("jungpoly")));
String jungmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("jungmovmt")));
String jungetc = Util.Uni2Ksc(Util.checkString(req.getParameter("jungetc")));
String dongpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("dongpoly")));
String dongmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("dongmovmt")));
String dongetc = Util.Uni2Ksc(Util.checkString(req.getParameter("dongetc")));
String etcpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("etcpoly")));
String etcmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("etcmovmt")));
String etcetc = Util.Uni2Ksc(Util.checkString(req.getParameter("etcetc")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String chgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setMakedt(makedt);
dm.setJungpoly(jungpoly);
dm.setJungmovmt(jungmovmt);
dm.setJungetc(jungetc);
dm.setDongpoly(dongpoly);
dm.setDongmovmt(dongmovmt);
dm.setDongetc(dongetc);
dm.setEtcpoly(etcpoly);
dm.setEtcmovmt(etcmovmt);
dm.setEtcetc(etcetc);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setChgpers(chgpers);
dm.setChgdt(chgdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 21:40:17 KST 2003 */