/***************************************************************************************************
* 파일명 : SP_PS_L_WEEKSND_CLOSPTCR_SERNO.java  
* 기능 :   출판업무지원시스템 정산마감 상세내역화면
* 작성일자 : 2007-11-02
* 작성자 : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 *  출판업무지원시스템 정산마감 상세내역화면
 *
 **/

public class PS_L_WEEKSND_CLOSPTCR_SERNODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String medicd;
	public String closym;
	public String etc1;
	public String etc2;
	public String etc3;

	public PS_L_WEEKSND_CLOSPTCR_SERNODM(){}
	public PS_L_WEEKSND_CLOSPTCR_SERNODM(String medicd, String closym, String etc1, String etc2, String etc3){
		this.medicd = medicd;
		this.closym = closym;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setClosym(String closym){
		this.closym = closym;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getClosym(){
		return this.closym;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_WEEKSND_CLOSPTCR_SERNO( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_WEEKSND_CLOSPTCR_SERNODM dm = (PS_L_WEEKSND_CLOSPTCR_SERNODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.medicd);
		cstmt.setString(4, dm.closym);
		cstmt.setString(5, dm.etc1);
		cstmt.setString(6, dm.etc2);
		cstmt.setString(7, dm.etc3);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_WEEKSND_CLOSPTCR_SERNODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String closym = req.getParameter("closym");
if( closym == null){
	System.out.println(this.toString+" : closym is null" );
}else{
	System.out.println(this.toString+" : closym is "+closym );
}
String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String medicd = Util.checkString(req.getParameter("medicd"));
String closym = Util.checkString(req.getParameter("closym"));
String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String closym = Util.Uni2Ksc(Util.checkString(req.getParameter("closym")));
String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMedicd(medicd);
dm.setClosym(closym);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 02 14:55:05 KST 2007 */