/***************************************************************************************************
* 파일명 : SS_L_NWSPITEMDM.java
* 기능 : 지국지원-신문지원물품-등록-목록을 위한 DM
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-등록-목록을 위한 DM
 */

public class SS_L_NWSPITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemcd;
	public String itemclsf;
	public String sendclsf;
	public String costclsf;
	public long pageno;
	public long pagesize;

	public SS_L_NWSPITEMDM(){}
	public SS_L_NWSPITEMDM(String itemcd, String itemclsf, String sendclsf, String costclsf, long pageno, long pagesize){
		this.itemcd = itemcd;
		this.itemclsf = itemclsf;
		this.sendclsf = sendclsf;
		this.costclsf = costclsf;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setCostclsf(String costclsf){
		this.costclsf = costclsf;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getCostclsf(){
		return this.costclsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NWSPITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWSPITEMDM dm = (SS_L_NWSPITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemcd);
		cstmt.setString(4, dm.itemclsf);
		cstmt.setString(5, dm.sendclsf);
		cstmt.setString(6, dm.costclsf);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_NWSPITEMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String sendclsf = req.getParameter("sendclsf");
if( sendclsf == null){
	System.out.println(this.toString+" : sendclsf is null" );
}else{
	System.out.println(this.toString+" : sendclsf is "+sendclsf );
}
String costclsf = req.getParameter("costclsf");
if( costclsf == null){
	System.out.println(this.toString+" : costclsf is null" );
}else{
	System.out.println(this.toString+" : costclsf is "+costclsf );
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

String itemcd = Util.checkString(req.getParameter("itemcd"));
String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String costclsf = Util.checkString(req.getParameter("costclsf"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String costclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("costclsf")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setItemcd(itemcd);
dm.setItemclsf(itemclsf);
dm.setSendclsf(sendclsf);
dm.setCostclsf(costclsf);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 21:18:50 KST 2004 */