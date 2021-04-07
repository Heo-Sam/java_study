package com.ict07.IO;

public class Ex01 {
	// File Ŭ����: Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
	// ������: File(File parent, String child), File(String pathname), 
	//		   File(String parent, String child), File(URI uri), �⺻�����ڴ� ����
	//		** parent => �������, child => �������
	//		   parent + child => ��ü ���
	//		   pathname => ��ü���
	//		   uri => ���� ��Ʈ��ũ�� �� �ʿ�
	
	
	// �ֿ� �޼ҵ�
	// - createNewFile(): boolean => ������ �����ϸ� true
	//								 �������� ���ϸ� false(���� �̸��� ������ ���� ����)
	// - mkdir(), mkdirs(): boolean => ���丮�� �����ϸ� true
	//								   �������� ���ϸ� false(���� �̸��� ������ ���� ����)
	//		** mkdir(), mkdirs() ������
	//		 ex) c:\base\want => want���丮�� ���鶧, base ���丮�� �������� ���� ��� �����Ұ�
	//		  : ��������ϴ� ���丮�� ���� ���丮�� �������� ���� ��� ���� �Ұ� => mkdir();
	//			���� ���丮�� base�� want���丮���� ������ش� => mkdirs();
	// - delete(): ����, ���丮 ����
	// - isDirectory(): ���丮�̸� true
	// - isFile(): �����̸� true
	//		** �������鿡�� ��ǻ�Ϳ��� ���ϰ� ���丮�� �����Ѵ�.
	//			��, ������ �ƴϸ� ���丮�̰�, ���丮�� �ƴϸ� �����̴�.
	
	// - ** list(): ������ ��ġ�� ���� �� ���丮�� String[]�� ��´�.
	// - length(): �迭�̳� String������ ���̸� ��������,
	//				File Ŭ���������� ���̰� �ƴ϶� ������ ũ�⸦ byte�� ǥ���� ��.
	//				(�뷮 : byte -> KB -> MB -> GB -> TB (�� �ܰ� �ö� ������ 2^10=1024))
	// - getAbsolutePath(): ������ ǥ��
	//					����� Ǯ����(���ۺ��� ������)=>���⼭ ������ root(��Ʈ)�� �̾߱���.
	//					ex) C:\sammy_study\javastudy\MyProject ��� ��
	// - getPath(): ����� ǥ��
	//				���� �� ��ġ���� �ش� ���ϱ��� �����ϱ� ���� ���ľ��ϴ� ���
	// - getCanonicalPath(): ����ȭ���
	// - lastModify(): ������ ������ ��¥
}
