/***************************************************************************************************
* 파일명 : SS_U_INFOEXGDM.java
* 기능 : 정보공유 게시판 수정
* 작성일자 : 2004-05-24
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
 * 정보공유 게시판 수정
 *
 */

public class SS_U_INFOEXGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public String notifrdt;
	public String notitodt;
	public String makepersid;
	public String makepersnm;
	public String email;
	public String hmpg;
	public String titl;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;
	public String cont5;
	public String rmsgdept;
	public String rmsgarea;
	public String rmsgexttcd;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String chgpers;

	public SS_U_INFOEXGDM(){}
	public SS_U_INFOEXGDM(String clsf, long seq, String notifrdt, String notitodt, String makepersid, String makepersnm, String email, String hmpg, String titl, String cont1, String cont2, String cont3, String cont4, String cont5, String rmsgdept, String rmsgarea, String rmsgexttcd, String filenm, String filesize, byte[] filecont, String chgpers){
		this.clsf = clsf;
		this.seq = seq;
		this.notifrdt = notifrdt;
		this.notitodt = notitodt;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.email = email;
		this.hmpg = hmpg;
		this.titl = titl;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.rmsgdept = rmsgdept;
		this.rmsgarea = rmsgarea;
		this.rmsgexttcd = rmsgexttcd;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.chgpers = chgpers;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setNotifrdt(String notifrdt){
		this.notifrdt = notifrdt;
	}

	public void setNotitodt(String notitodt){
		this.notitodt = notitodt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setHmpg(String hmpg){
		this.hmpg = hmpg;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont1(String cont1){
		this.cont1 = cont1;
	}

	public void setCont2(String cont2){
		this.cont2 = cont2;
	}

	public void setCont3(String cont3){
		this.cont3 = cont3;
	}

	public void setCont4(String cont4){
		this.cont4 = cont4;
	}

	public void setCont5(String cont5){
		this.cont5 = cont5;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
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

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getNotifrdt(){
		return this.notifrdt;
	}

	public String getNotitodt(){
		return this.notitodt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getHmpg(){
		return this.hmpg;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont1(){
		return this.cont1;
	}

	public String getCont2(){
		return this.cont2;
	}

	public String getCont3(){
		return this.cont3;
	}

	public String getCont4(){
		return this.cont4;
	}

	public String getCont5(){
		return this.cont5;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
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

	public String getSQL(){
		 return "{ call SP_SS_U_INFOEXG( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_INFOEXGDM dm = (SS_U_INFOEXGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.notifrdt);
		cstmt.setString(6, dm.notitodt);
		cstmt.setString(7, dm.makepersid);
		cstmt.setString(8, dm.makepersnm);
		cstmt.setString(9, dm.email);
		cstmt.setString(10, dm.hmpg);
		cstmt.setString(11, dm.titl);
		cstmt.setString(12, dm.cont1);
		cstmt.setString(13, dm.cont2);
		cstmt.setString(14, dm.cont3);
		cstmt.setString(15, dm.cont4);
		cstmt.setString(16, dm.cont5);
		cstmt.setString(17, dm.rmsgdept);
		cstmt.setString(18, dm.rmsgarea);
		cstmt.setString(19, dm.rmsgexttcd);
		cstmt.setString(20, dm.filenm);
		cstmt.setString(21, dm.filesize);
		cstmt.setBytes(22, dm.filecont);
		cstmt.setString(23, dm.chgpers);
		cstmt.registerOutParameter(24, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_INFOEXGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String notifrdt = req.getParameter("notifrdt");
if( notifrdt == null){
	System.out.println(this.toString+" : notifrdt is null" );
}else{
	System.out.println(this.toString+" : notifrdt is "+notifrdt );
}
String notitodt = req.getParameter("notitodt");
if( notitodt == null){
	System.out.println(this.toString+" : notitodt is null" );
}else{
	System.out.println(this.toString+" : notitodt is "+notitodt );
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
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String hmpg = req.getParameter("hmpg");
if( hmpg == null){
	System.out.println(this.toString+" : hmpg is null" );
}else{
	System.out.println(this.toString+" : hmpg is "+hmpg );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont1 = req.getParameter("cont1");
if( cont1 == null){
	System.out.println(this.toString+" : cont1 is null" );
}else{
	System.out.println(this.toString+" : cont1 is "+cont1 );
}
String cont2 = req.getParameter("cont2");
if( cont2 == null){
	System.out.println(this.toString+" : cont2 is null" );
}else{
	System.out.println(this.toString+" : cont2 is "+cont2 );
}
String cont3 = req.getParameter("cont3");
if( cont3 == null){
	System.out.println(this.toString+" : cont3 is null" );
}else{
	System.out.println(this.toString+" : cont3 is "+cont3 );
}
String cont4 = req.getParameter("cont4");
if( cont4 == null){
	System.out.println(this.toString+" : cont4 is null" );
}else{
	System.out.println(this.toString+" : cont4 is "+cont4 );
}
String cont5 = req.getParameter("cont5");
if( cont5 == null){
	System.out.println(this.toString+" : cont5 is null" );
}else{
	System.out.println(this.toString+" : cont5 is "+cont5 );
}
String rmsgdept = req.getParameter("rmsgdept");
if( rmsgdept == null){
	System.out.println(this.toString+" : rmsgdept is null" );
}else{
	System.out.println(this.toString+" : rmsgdept is "+rmsgdept );
}
String rmsgarea = req.getParameter("rmsgarea");
if( rmsgarea == null){
	System.out.println(this.toString+" : rmsgarea is null" );
}else{
	System.out.println(this.toString+" : rmsgarea is "+rmsgarea );
}
String rmsgexttcd = req.getParameter("rmsgexttcd");
if( rmsgexttcd == null){
	System.out.println(this.toString+" : rmsgexttcd is null" );
}else{
	System.out.println(this.toString+" : rmsgexttcd is "+rmsgexttcd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String notifrdt = Util.checkString(req.getParameter("notifrdt"));
String notitodt = Util.checkString(req.getParameter("notitodt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String email = Util.checkString(req.getParameter("email"));
String hmpg = Util.checkString(req.getParameter("hmpg"));
String titl = Util.checkString(req.getParameter("titl"));
String cont1 = Util.checkString(req.getParameter("cont1"));
String cont2 = Util.checkString(req.getParameter("cont2"));
String cont3 = Util.checkString(req.getParameter("cont3"));
String cont4 = Util.checkString(req.getParameter("cont4"));
String cont5 = Util.checkString(req.getParameter("cont5"));
String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));
String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));
String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String notifrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("notifrdt")));
String notitodt = Util.Uni2Ksc(Util.checkString(req.getParameter("notitodt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String hmpg = Util.Uni2Ksc(Util.checkString(req.getParameter("hmpg")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont1")));
String cont2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont2")));
String cont3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont3")));
String cont4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont4")));
String cont5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont5")));
String rmsgdept = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdept")));
String rmsgarea = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgarea")));
String rmsgexttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgexttcd")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setNotifrdt(notifrdt);
dm.setNotitodt(notitodt);
dm.setMakepersid(makepersid);
dm.setMakepersnm(makepersnm);
dm.setEmail(email);
dm.setHmpg(hmpg);
dm.setTitl(titl);
dm.setCont1(cont1);
dm.setCont2(cont2);
dm.setCont3(cont3);
dm.setCont4(cont4);
dm.setCont5(cont5);
dm.setRmsgdept(rmsgdept);
dm.setRmsgarea(rmsgarea);
dm.setRmsgexttcd(rmsgexttcd);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setChgpers(chgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 25 12:59:02 KST 2004 */