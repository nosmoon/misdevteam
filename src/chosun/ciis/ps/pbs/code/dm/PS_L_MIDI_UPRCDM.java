/***************************************************************************************************
 * 파일명   : PS_L_MIDI_UPRC.java
 * 기능     : 매체단가 관리 - 조회
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
 *  매체단가 관리 - 조회
 */

public class PS_L_MIDI_UPRCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String medicd;
	public String aplydtbgn;
	public String aplydtend;
	public long pageno;
	public long pagesize;

	public PS_L_MIDI_UPRCDM(){}
	public PS_L_MIDI_UPRCDM(String cmpycd, String bocd, String medicd, String aplydtbgn, String aplydtend, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.medicd = medicd;
		this.aplydtbgn = aplydtbgn;
		this.aplydtend = aplydtend;
		this.pageno = pageno;
		this.pagesize = pagesize;
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

	public void setAplydtbgn(String aplydtbgn){
		this.aplydtbgn = aplydtbgn;
	}

	public void setAplydtend(String aplydtend){
		this.aplydtend = aplydtend;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public String getAplydtbgn(){
		return this.aplydtbgn;
	}

	public String getAplydtend(){
		return this.aplydtend;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_MIDI_UPRC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_MIDI_UPRCDM dm = (PS_L_MIDI_UPRCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.aplydtbgn);
		cstmt.setString(7, dm.aplydtend);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_L_MIDI_UPRCDataSet();
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
String aplydtbgn = req.getParameter("aplydtbgn");
if( aplydtbgn == null){
	System.out.println(this.toString+" : aplydtbgn is null" );
}else{
	System.out.println(this.toString+" : aplydtbgn is "+aplydtbgn );
}
String aplydtend = req.getParameter("aplydtend");
if( aplydtend == null){
	System.out.println(this.toString+" : aplydtend is null" );
}else{
	System.out.println(this.toString+" : aplydtend is "+aplydtend );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String aplydtbgn = Util.checkString(req.getParameter("aplydtbgn"));
String aplydtend = Util.checkString(req.getParameter("aplydtend"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String aplydtbgn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplydtbgn")));
String aplydtend = Util.Uni2Ksc(Util.checkString(req.getParameter("aplydtend")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setAplydtbgn(aplydtbgn);
dm.setAplydtend(aplydtend);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 15:28:04 KST 2005 */