public class YodaSpeak {

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<ResponseBody> repos = service.listRepos("octocat");

        System.out.println(repos.execute().body().string());
    }

}
