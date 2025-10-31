# GitHub Metrics Scripts

This folder contains a Python script that collects pull request metrics (cycle time and lines of code changed) for one or more GitHub repositories.

## Requirements

* Python 3.9+
* `requests`
* `matplotlib` (optional, only required for chart generation)

You can install the optional dependency with:

```bash
pip install matplotlib
```

## Usage

1. Create a GitHub personal access token with access to the repositories you want to analyse and export it as `GITHUB_TOKEN`.
2. Run the script and provide the repositories you want to query:

```bash
export GITHUB_TOKEN=ghp_yourtoken
python fetch_metrics.py --repos your-org/repo-one your-org/repo-two --weeks 26 --output ./metrics
```

The script creates the following outputs inside the selected directory:

* `raw_pull_requests.csv` – pull request level data with cycle time and LOC values.
* `weekly_aggregate.csv` – team-level weekly aggregates.
* `weekly_by_author.csv` – author-level weekly aggregates.
* `charts/` – PNG charts summarising the weekly metrics (if `matplotlib` is available).

Cycle time is calculated as the number of hours between pull request creation and merge. Lines of code are the additions and deletions reported by GitHub for each merged pull request.
