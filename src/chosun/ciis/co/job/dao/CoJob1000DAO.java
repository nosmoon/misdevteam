/***************************************************************************************************
 * ���ϸ�   : CoJob1000DAO.java
 * ���     : ��������-�������� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.co.job.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.co.job.dm.CO_JOB_1000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1002_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1001_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1010_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1015_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1016_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1020_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1025_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1030_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1040_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1050_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1060_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1070_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1080_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1081_LDM;
import chosun.ciis.co.job.ds.CO_JOB_1000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1002_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1001_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1010_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1015_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1016_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1020_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1025_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1030_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1040_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1050_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1060_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1070_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1080_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1081_LDataSet;


/**
 * ��������-��������
 */
 
public class CoJob1000DAO {
	
	public CO_JOB_1000_MDataSet co_job_1000_m(CO_JOB_1000_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1000_MDataSet ds = (CO_JOB_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
	public CO_JOB_1002_MDataSet co_job_1002_m(CO_JOB_1002_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1002_MDataSet ds = (CO_JOB_1002_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    /**
     * ��������-�������� �����ȸ
     * @param dm CO_JOB_1010_LDM
     * @return CO_JOB_1010_LDataSet
     * @throws AppException
     */
    public CO_JOB_1001_MDataSet co_job_1001_m(CO_JOB_1001_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1001_MDataSet ds = (CO_JOB_1001_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }	
    /**
     * ��������-�������� �����ȸ
     * @param dm CO_JOB_1010_LDM
     * @return CO_JOB_1010_LDataSet
     * @throws AppException
     */
    public CO_JOB_1010_LDataSet co_job_1010_l(CO_JOB_1010_LDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1010_LDataSet ds = (CO_JOB_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * ��������-�������� ������ȸ
     * @param dm CO_JOB_1015_SDM
     * @return CO_JOB_1015_SDataSet
     * @throws AppException
     */
    public CO_JOB_1015_SDataSet co_job_1015_s(CO_JOB_1015_SDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1015_SDataSet ds = (CO_JOB_1015_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    /**
     * ��������-�������� ������ȸ
     * @param dm CO_JOB_1016_SDM
     * @return CO_JOB_1016_SDataSet
     * @throws AppException
     */
    public CO_JOB_1016_SDataSet co_job_1016_s(CO_JOB_1016_SDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1016_SDataSet ds = (CO_JOB_1016_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    
    /**
     * ��������-�������� ���� ����ȸ
     * @param dm CO_JOB_1020_SDM
     * @return CO_JOB_1020_SDataSet
     * @throws AppException
     */
    public CO_JOB_1020_SDataSet co_job_1020_s(CO_JOB_1020_SDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1020_SDataSet ds = (CO_JOB_1020_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    /**
     * ��������-�������� ���� ����ȸ
     * @param dm CO_JOB_1025_LDM
     * @return CO_JOB_1025_LDataSet
     * @throws AppException
     */
    public CO_JOB_1025_LDataSet co_job_1025_l(CO_JOB_1025_LDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1025_LDataSet ds = (CO_JOB_1025_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * ��������-�������� �亯 ��� ��ȸ
     * @param dm CO_JOB_1030_LDM
     * @return CO_JOB_1030_LDataSet
     * @throws AppException
     */
    public CO_JOB_1030_LDataSet co_job_1030_l(CO_JOB_1030_LDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1030_LDataSet ds = (CO_JOB_1030_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * ��������-�������� �亯 ���,����,���� ó��
     * @param dm CO_JOB_1040_ADM
     * @return 
     * @throws AppException
     */
    public CO_JOB_1040_ADataSet co_job_1040_a(CO_JOB_1040_ADM dm) throws AppException, SQLException {
    	
    	CO_JOB_1040_ADataSet ds = null;
        // ��Ͻ� ÷�������� ���� ��� �Ǵ� ������ ���ϰ����̰� ÷�������� ���� ���... 
        if ((dm.add_file != null && dm.add_file.length > 0 && "".equals(dm.file_delyn)) || 
        	(dm.add_file != null && dm.add_file.length > 0 && "U".equals(dm.file_delyn))
        ) {  
        	String tempSeq	= "";
        	byte[] tempCont = dm.add_file;
           	DBManager manager = null;

           	try {
          	
           		manager = new DBManager("MISCOM");
           		manager.getConnection();
           		manager.m_conn.setAutoCommit(false);
            
           		CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
            
               // �Ķ���� ����
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.job_clsf);
        		cstmt.setString(5, dm.cntc_seq);
        		cstmt.setString(6, dm.answer_cont);
        		cstmt.setString(7, dm.add_file_nm);
        		cstmt.setBytes(8, "0101".getBytes());
        		cstmt.setString(9, dm.file_delyn);
        		cstmt.setString(10, dm.incmg_pers_ip);
        		cstmt.setString(11, dm.incmg_pers);
        		cstmt.registerOutParameter(12, Types.VARCHAR);
               // ����
	    		cstmt.execute();
               // ���
	    		ds = (CO_JOB_1040_ADataSet)dm.createDataSetObject();
	    		ds.getValues(cstmt);

	    		if(!"".equals(ds.errcode)){
                  	throw new AppException(ds.errcode, ds.errmsg);
	    		}
	    		
	    		tempSeq	=	ds.rmsg_seq;

               // BLOB ���ϱ�
	    		Statement stmt = manager.m_conn.createStatement();
	    		StringBuffer blobQuery = new StringBuffer();
	    		blobQuery.append(" SELECT ADD_FILE FROM TACOD_JOBCNTCRMSG ");
	    		blobQuery.append(" WHERE  CMPY_CD   = '"+dm.cmpy_cd +"' ");
	    		blobQuery.append(" AND    JOB_CLSF  = '"+dm.job_clsf+"' ");
	    		blobQuery.append(" AND    CNTC_SEQ  = '"+dm.cntc_seq+"' ");
	    		blobQuery.append(" AND    RMSG_SEQ  = '"+tempSeq+"' ");
	    		blobQuery.append(" FOR    UPDATE ");

	    		OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery.toString());
         	
	    		if (rset.next()) {             
	    			//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
	    			//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	    			oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
	    			OutputStream os = oracle_blob.getBinaryOutputStream();
                   // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
	    			for(int i=0; i<tempCont.length; i++){
	    				os.write(tempCont[i]);
	    			}
	    			os.close();
	    		}
	    		manager.m_conn.commit();
	    		manager.m_conn.setAutoCommit(true);  
	    		stmt.close();
	    		manager.disConnection();
           	} catch (Exception e) {
           		e.printStackTrace();
           		try{
           			manager.m_conn.rollback();
           		}catch(SQLException se){
           			throw new SysException(se);
           		}
           		manager.disConnection();
           		throw new SysException(e);
           	}
        }else{
        	DBManager manager = new DBManager("MISCOM");
        	ds = (CO_JOB_1040_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }    
    
    public CO_JOB_1050_ADataSet co_job_1050_a(CO_JOB_1050_ADM dm) throws AppException, SQLException {    	
    	CO_JOB_1050_ADataSet ds = null;
        // ��Ͻ� ÷�������� ���� ��� �Ǵ� ������ ���ϰ����̰� ÷�������� ���� ���... 
        if ((dm.add_file != null && dm.add_file.length > 0 && "".equals(dm.file_delyn)) || 
        	(dm.add_file != null && dm.add_file.length > 0 && "U".equals(dm.file_delyn))
        ) {  
        	
        	String tempSeq = "";     // �ӽ� ����
        	byte[] tempCont;    	// �ӽ� ÷������ ����
           
        	tempCont = dm.add_file;
        	DBManager manager = null;
           
        	try {
          	
        		manager = new DBManager("MISCOM");
        		manager.getConnection();
        		manager.m_conn.setAutoCommit(false);
            
        		CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
            
               // �Ķ���� ����
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.flag);
        		cstmt.setString(4, dm.cmpy_cd);
        		cstmt.setString(5, dm.job_clsf);
        		cstmt.setString(6, dm.cntc_seq);
        		cstmt.setString(7, dm.team_cd);
        		cstmt.setString(8, dm.team_nm);
        		cstmt.setString(9, dm.part_cd);
        		cstmt.setString(10, dm.part_nm);
        		cstmt.setString(11, dm.rmsg_pers);
        		cstmt.setString(12, dm.ptph_no);
        		cstmt.setString(13, dm.make_dt);
        		cstmt.setString(14, dm.answer_yn);
        		cstmt.setString(15, dm.sms_yn);
        		cstmt.setString(16, dm.titl);
        		cstmt.setString(17, dm.cont);
        		cstmt.setString(18, dm.add_file_nm);
        		cstmt.setBytes(19, "1010".getBytes());
        		cstmt.setString(20, dm.file_delyn);
        		cstmt.setString(21, dm.incmg_pers_ip);
        		cstmt.setString(22, dm.incmg_pers);
        		cstmt.setString(23, dm.uid);
        		cstmt.setString(24, dm.frdt);
        		cstmt.setString(25, dm.todt);
        		cstmt.registerOutParameter(26, Types.VARCHAR);
        		cstmt.registerOutParameter(27, Types.VARCHAR);
       		   
               // ����
	    		cstmt.execute(); 
               // ���
	    		ds = (CO_JOB_1050_ADataSet)dm.createDataSetObject();
	    		ds.getValues(cstmt);

	    		if(!"".equals(ds.errcode)){
	    			
	    			System.out.println(ds.errcode);
                   throw new AppException(ds.errcode, ds.errmsg);
	    		}
               // ÷������ ������ ������ �����͸� ����ϰ� �������� ��´�.
               //�Է��� ��
           	   	tempSeq = ds.getCntc_seq();
           	  	
               // BLOB ���ϱ�
           	   	Statement stmt = manager.m_conn.createStatement();
           	   	StringBuffer blobQuery = new StringBuffer();
           	   	blobQuery.append(" SELECT ADD_FILE FROM TACOM_JOBCNTC ");
           	   	blobQuery.append(" WHERE  CMPY_CD  = '"+dm.cmpy_cd+"' ");
           	   	blobQuery.append(" AND    JOB_CLSF = '"+dm.job_clsf+"' ");
           	   	blobQuery.append(" AND    CNTC_SEQ = '"+tempSeq+"' ");
           	   	blobQuery.append(" FOR 	 UPDATE ");  
           	        
           	   	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery.toString());
           	    	
           	   	if (rset.next()) {             
           	   		//��������
//           	   		weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//           	   		BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
           	   		
           	   		//������(ep1)
           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
           	   		
           	   		OutputStream os = oracle_blob.getBinaryOutputStream();                       
                   // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
           	   		for(int i=0; i<tempCont.length; i++){
           	   			os.write(tempCont[i]);
           	   		}
           	   		os.close();
           	   	}
           	   	manager.m_conn.commit(); 
           	   	manager.m_conn.setAutoCommit(true);  
        	   	stmt.close();
        	   	manager.disConnection();
	     	} catch (AppException e){
	             manager.disConnection();
	             throw e;
	     	} catch (Exception e) {
	     		try{
	     			manager.m_conn.rollback();
	     		}catch(SQLException se){
	     			throw new SysException(se);
	     		}
	     		manager.disConnection();
	     		throw new SysException(e); 
	     	}
        }else{
        	DBManager manager = new DBManager("MISCOM");
        	ds = (CO_JOB_1050_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }
    
    /**
     * ��������-�������� �亯 ����ȸ
     * @param dm CO_JOB_1060_SDM
     * @return CO_JOB_1060_SDataSet
     * @throws AppException
     */
    public CO_JOB_1060_SDataSet co_job_1060_s(CO_JOB_1060_SDM dm) throws AppException, SQLException {    
    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1060_SDataSet ds = (CO_JOB_1060_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }    
    
    /**
	 * ��������-�������� ÷������ �ٿ�ε�
	 * @param  CO_JOB_1070_ADM
	 * @return CO_JOB_1070_ADataSet
	 * @throws AppException
	 */
    public CO_JOB_1070_ADataSet co_job_1070_a(CO_JOB_1070_ADM dm) throws AppException, SQLException {
    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1070_ADataSet ds = (CO_JOB_1070_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
	 * ��������-�������� �����ڸ����ȸ
	 * @param  CO_JOB_1080_LDM
	 * @return CO_JOB_1080_LDataSet
	 * @throws AppException
	 */
    public CO_JOB_1080_LDataSet co_job_1080_l(CO_JOB_1080_LDM dm) throws AppException, SQLException {
    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1080_LDataSet ds = (CO_JOB_1080_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
	 * ��������-�������� �����ڸ�ϻ���
	 * @param  CO_JOB_1081_LDM
	 * @return CO_JOB_1081_LDataSet
	 * @throws AppException
	 */
    public CO_JOB_1081_LDataSet co_job_1081_l(CO_JOB_1081_LDM dm) throws AppException, SQLException {
    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_1081_LDataSet ds = (CO_JOB_1081_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
