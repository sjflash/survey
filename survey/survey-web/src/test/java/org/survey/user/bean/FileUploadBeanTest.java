package org.survey.user.bean;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test FileUploadBean. Must use SpringJUnit4ClassRunner to enable spring
 * injection. Loaded Spring configuration is defined by ContextConfiguration.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-test.xml")
public class FileUploadBeanTest {
//	@Autowired
//	FileUploadBean fileUploadBean;
//	@Autowired
//	FileRepository fileRepository;
//
//	@Before
//	public void setUp() {
//		fileUploadBean.setUserBean(new UserBeanMock("username"));
//	}
//
//	@After
//	public void tearDown() {
//		fileRepository.deleteAll();
//	}
//
//	@Test
//	public void uploadFile() throws Exception {
//		UploadedFile uploadedFile = new UploadedFileMock("filename",
//				"mimeType", "content".getBytes());
//		FileUploadEvent fileUploadEvent = new FileUploadEvent(new UIInput(),
//				uploadedFile);
//		fileUploadBean.uploadFile(fileUploadEvent);
//		Iterable<File> files = fileRepository.findAllByFilename("filename");
//		Assert.assertEquals(1, IteratorUtils.toList(files.iterator()).size());
//	}
//
//	public class UserBeanMock extends UserBean {
//		private String username;
//
//		public UserBeanMock(String username) {
//			this.username = username;
//		}
//
//		@Override
//		public String getUsername() {
//			return username;
//		}
//	}
//
//	@Data
//	@RequiredArgsConstructor
//	private class UploadedFileMock implements UploadedFile {
//		@NonNull
//		private String name;
//		@NonNull
//		private String contentType;
//		private long size;
//		@NonNull
//		private byte[] data;
//
//		@Override
//		public byte[] getData() throws FileUploadException {
//			return data;
//		}
//
//		@Override
//		public InputStream getInputStream() throws IOException {
//			return null;
//		}
//
//		@Override
//		public void delete() throws IOException {
//		}
//
//		@Override
//		public void write(String fileName) throws IOException {
//		}
//
//		@Override
//		public String getHeader(String headerName) {
//			return null;
//		}
//
//		@Override
//		public Collection<String> getHeaderNames() {
//			return null;
//		}
//
//		@Override
//		public Collection<String> getHeaders(String headerName) {
//			return null;
//		}
//
//		@Override
//		public String getParameterName() {
//			return null;
//		}
//	}
}
