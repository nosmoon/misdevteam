/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_STAFCYB_RSLTDDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(�����)-�󼼸��
* �ۼ����� : 2004-04-08
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-����(�����)-�󼼸��
 *
 */

public class SS_L_RDR_EXTN_STAFCYB_RSLTDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String stafno;

	public SS_L_RDR_EXTN_STAFCYB_RSLTDDM(){}
	public SS_L_RDR_EXTN_STAFCYB_RSLTDDM(String frdt, String todt, String stafno){
		this.frdt = frdt;
		this.todt = todt;
		this.stafno = stafno;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_STAFCYB_RSLTD( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_STAFCYB_RSLTDDM dm = (SS_L_RDR_EXTN_STAFCYB_RSLTDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.stafno);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_STAFCYB_RSLTDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String stafno = Util.checkString(req.getParameter("stafno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setStafno(stafno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 08 17:25:44 KST 2004 */