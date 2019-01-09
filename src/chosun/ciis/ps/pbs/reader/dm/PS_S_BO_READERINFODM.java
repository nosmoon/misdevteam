/***************************************************************************************************
* ���ϸ� : PS_S_BO_READERINFO.java
* ��� :   ���� - ���� ���� ���� ����ȸ
* �ۼ����� : 2007-03-28
* �ۼ��� : ����ǥ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * ���� - ���� ���� ����ȸ
 *
 */

public class PS_S_BO_READERINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;

	public PS_S_BO_READERINFODM(){}
	public PS_S_BO_READERINFODM(String rdr_no, String medicd, String termsubsno){
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
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

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_BO_READERINFO( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_BO_READERINFODM dm = (PS_S_BO_READERINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.termsubsno);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_S_BO_READERINFODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 30 14:48:37 KST 2007 */