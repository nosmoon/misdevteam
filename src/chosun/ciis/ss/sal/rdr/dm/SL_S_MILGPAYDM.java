/***************************************************************************************************
* ���ϸ� : SL_S_MILGPAYDM.java
* ��� : ������������(���ϸ������޳����˾�-����ȸ)
* �ۼ����� : 2004-06-03
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ������������(���ϸ������޳����˾�-����ȸ)
 *
 */

public class SL_S_MILGPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String milgpaydt;
	public String milgpayno;

	public SL_S_MILGPAYDM(){}
	public SL_S_MILGPAYDM(String rdr_no, String milgpaydt, String milgpayno){
		this.rdr_no = rdr_no;
		this.milgpaydt = milgpaydt;
		this.milgpayno = milgpayno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMilgpaydt(String milgpaydt){
		this.milgpaydt = milgpaydt;
	}

	public void setMilgpayno(String milgpayno){
		this.milgpayno = milgpayno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMilgpaydt(){
		return this.milgpaydt;
	}

	public String getMilgpayno(){
		return this.milgpayno;
	}

	public String getSQL(){
		 return "{ call SP_SL_S_MILGPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_MILGPAYDM dm = (SL_S_MILGPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.milgpaydt);
		cstmt.setString(5, dm.milgpayno);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_S_MILGPAYDataSet();
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
String milgpaydt = req.getParameter("milgpaydt");
if( milgpaydt == null){
	System.out.println(this.toString+" : milgpaydt is null" );
}else{
	System.out.println(this.toString+" : milgpaydt is "+milgpaydt );
}
String milgpayno = req.getParameter("milgpayno");
if( milgpayno == null){
	System.out.println(this.toString+" : milgpayno is null" );
}else{
	System.out.println(this.toString+" : milgpayno is "+milgpayno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));
String milgpayno = Util.checkString(req.getParameter("milgpayno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String milgpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("milgpaydt")));
String milgpayno = Util.Uni2Ksc(Util.checkString(req.getParameter("milgpayno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_no(rdr_no);
dm.setMilgpaydt(milgpaydt);
dm.setMilgpayno(milgpayno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 06 19:52:50 KST 2004 */