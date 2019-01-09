/***************************************************************************************************
* ���ϸ� : SP_PS_D_RETN_PTCR_DTL.java
* �߼�-�ݼ۰��� ���õ� ���� ����
* �ۼ����� : 2004-03-19
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ : 
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-�ݼ۰��� �ݼ۳��� ����ó��
 *
 */

  

public class PS_D_RETN_PTCR_DTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String retnseqarr;

	public PS_D_RETN_PTCR_DTLDM(){}
	public PS_D_RETN_PTCR_DTLDM(String cmpycd, String incmgpers, String rdr_no, String medicd, String termsubsno, String retnseqarr){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.retnseqarr = retnseqarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRetnseqarr(String retnseqarr){
		this.retnseqarr = retnseqarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRetnseqarr(){
		return this.retnseqarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_RETN_PTCR_DTL( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_RETN_PTCR_DTLDM dm = (PS_D_RETN_PTCR_DTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.termsubsno);
		cstmt.setString(8, dm.retnseqarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_D_RETN_PTCR_DTLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String retnseqarr = req.getParameter("retnseqarr");
if( retnseqarr == null){
	System.out.println(this.toString+" : retnseqarr is null" );
}else{
	System.out.println(this.toString+" : retnseqarr is "+retnseqarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String retnseqarr = Util.checkString(req.getParameter("retnseqarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String retnseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("retnseqarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setRetnseqarr(retnseqarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 19 19:49:25 KST 2004 */