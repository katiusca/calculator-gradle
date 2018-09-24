FROM gradle:jdk8
RUN git clone https://github.com/katiusca/calculator-gradle.git
WORKDIR calculator-gradle
CMD ["gradle", "--stacktrace", "run"]