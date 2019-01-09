/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.decid.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.decid.ds.*;
import chosun.ciis.co.decid.rec.*;

/**
 * 
 */


public class CO_DECID_2001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String docid;
	public String subseq;

	public CO_DECID_2001_LDM(){}
	public CO_DECID_2001_LDM(String cmpy_cd, String docid, String subseq){
		this.cmpy_cd = cmpy_cd;
		this.docid = docid;
		this.subseq = subseq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDocid(String docid){
		this.docid = docid;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDocid(){
		return this.docid;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getSQL(){
		 return "{ call SP_CO_DECID_2001_L( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DECID_2001_LDM dm = (CO_DECID_2001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.docid);
		cstmt.setString(5, dm.subseq);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.decid.ds.CO_DECID_2001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("docid = " + getDocid());
        System.out.println("subseq = " + getSubseq());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String docid = req.getParameter("docid");
if( docid == null){
	System.out.println(this.toString+" : docid is null" );
}else{
	System.out.println(this.toString+" : docid is "+docid );
}
String subseq = req.getParameter("subseq");
if( subseq == null){
	System.out.println(this.toString+" : subseq is null" );
}else{
	System.out.println(this.toString+" : subseq is "+subseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String docid = Util.checkString(req.getParameter("docid"));
String subseq = Util.checkString(req.getParameter("subseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String docid = Util.Uni2Ksc(Util.checkString(req.getParameter("docid")));
String subseq = Util.Uni2Ksc(Util.checkString(req.getParameter("subseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDocid(docid);
dm.setSubseq(subseq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 13:34:41 KST 2009 */