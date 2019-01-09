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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1075_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proofidx;

	public TN_DNS_1075_ADM(){}
	public TN_DNS_1075_ADM(String cmpy_cd, String proofidx){
		this.cmpy_cd = cmpy_cd;
		this.proofidx = proofidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProofidx(String proofidx){
		this.proofidx = proofidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProofidx(){
		return this.proofidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1075_A(? ,? ,? ,? ,? ,? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1075_ADM dm = (TN_DNS_1075_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proofidx);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1075_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proofidx = [" + getProofidx() + "]");
	}
}

/* �ۼ��ð� : Mon Jul 25 15:45:59 KST 2016 */