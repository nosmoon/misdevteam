/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EMPALONDDM.java
* ��� : ���Ȯ�� ���� �󼼸���� ���� DM
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;
	public String empseq;

	public SS_L_RDR_EXTN_EMPALONDDM(){}
	public SS_L_RDR_EXTN_EMPALONDDM(String rdr_extncampno, String empseq){
		this.rdr_extncampno = rdr_extncampno;
		this.empseq = empseq;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPALOND( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPALONDDM dm = (SS_L_RDR_EXTN_EMPALONDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.setString(4, dm.empseq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPALONDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String empseq = Util.checkString(req.getParameter("empseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_extncampno(rdr_extncampno);
dm.setEmpseq(empseq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 16 11:53:45 KST 2003 */